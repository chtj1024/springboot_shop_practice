# 프로젝트 소개
Spring Boot와 JPA를 활용하여 회원관리부터 상품관리, 장바구니, 주문 기능까지 구현한 쇼핑몰 프로젝트입니다.

Spring Security를 적용하여 인증 및 권한 관리를 구현하였으며 QueryDSL을 이용하여 동적 검색 기능을 구현했습니다.

## 담당(개인)
- 회원
  - 회원가입
  - 로그인
  - 비밀번호 암호화(BCrypt)
  - 권한(USER / ADMIN)
- 상품
  - 상품 등록
  - 상품 수정
  - 상품 삭제
  - 상품 조회
  - 상품 이미지 업로드
- 주문
  - 상품 주문
  - 주문 내역 조회
  - 주문 취소
- 장바구니
  - 장바구니 추가
  - 장바구니 삭제
  - 수량 변경
  - 장바구니에서 주문

## 적용된 기술
- Backend 
  - Java 21 
  - Spring Boot 3 
  - Spring Security 
  - Spring Data JPA 
  - QueryDSL   
- DataBase 
  - Mysql 
  - H2 
- FrontEnd 
  - Thymeleaf 
  - HTML/CSS 
  - JavaScript 
- ETC 
  - Gradle 
  - Git 
  - Github 

## 기술 상세
- Spring Security
  - 인증 및 인가 구현
  - 로그인 기능 구현
  - BCrypt를 이용한 비밀번호 암호화
  - URL별 권한 관리
- JPA
  - Entity 기반 ORM 적용
  - Repository를 이용한 CRUD 구현
  - 연관관계 매핑
  - BaseEntity를 통한 공통 컬럼 관리
- QueryDSL
  - 상품 검색 조건에 따른 동적 조회 구현
  - 타입 안정성을 제공하는 QueryDSL 적용
- 파일 업로드
  - 상품 이미지 업로드
  - 서버 저장
  - 이미지 조회
- Validation
  - Bean Validation을 이용한 입력값 검증
  - 예외 처리

## 아키텍처
Client - Thymeleaf - Controller - Service - Repository - Mysql

## 프로젝트를 통하여 얻은점
- Spring Security를 활용한 로그인 및 권한(Role) 관리
- QueryDSL을 이용한 동적 검색 구현
- JPA 연관관계를 활용한 회원, 상품, 주문, 장바구니 모델링
- 상품 이미지 업로드 관리
- BaseEntity와 Auditing을 이용한 공통 생성/수정 시간 관리
- DTO를 통한 계층 분리
- JUnit 기반 서비스 테스트 코드 작성
