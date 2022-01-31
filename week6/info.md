# 6주차
자바 필드와 메소드실습

1. 필드와 메소드 실습하기

BankAccount 클래스에 다음 메소드를 추가하고 테스트 하시오.

필드 값
Int accountNumber //계좌번호
String owner //예금주
Int balance //잔액 표시


Void deposit (int amount) : 저금 기능 메소드
Void withdraw (int amount) : 인출 기능 메소드
Public String toString() : 잔액 출력 메소드
Public int sendAccount(int amount, BankAccount otherAccount) : 계좌이체 기능 메소드


계좌 이체 송금액이 계좌 잔액보다 큰 경우 계좌 이체 실패 메시지 출력
