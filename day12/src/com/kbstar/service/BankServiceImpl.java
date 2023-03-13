/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author ttyg567
 *
 */
public class BankServiceImpl
		implements com.kbstar.frame.BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		notification = new NotificationImpl();

	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "축하합니다");
		notification.sendSMS(v.getContact(), "축하합니다.");

	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("로그인 성공");
			} else {
				throw new Exception("로그인 실패 ...");
			}

		} else {
			throw new Exception("로그인 실패 ...");
		}

		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.sendEmail(user.getEmail(), accNo + "계좌를 생성하셨습니다.");
		notification.sendEmail(user.getContact(), accNo + "계좌를 생성하셨습니다.");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return transactionDao.search(acc);
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송 ...");
		// 계좌 정보 수정 - 거래하기 전의 balance 값을 가져와서 출금 금액을 빼준다
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance);
		accountDao.update(acc); // balance가 기존 balance에서 바뀐다
		
		// 거래내역 추가 - 계좌에 대한 새로운 거래 내역이 추가됨
		TransactionDTO tr = 
				new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "O", desc);
		transactionDao.insert(tr);
		
		//SMS, Email 전송
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.sendEmail(u.getEmail(), sendAcc + "에서 " + balance + " 원이 출금되었습니다.");
		notification.sendEmail(u.getContact(), sendAcc + "에서 " + balance + " 원이 출금되었습니다.");
		
		
		
		
		
		
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
		
	}

}
