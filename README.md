## 👫 에이블디 알고리즘 스터디

<p align="center">
  <img width="360" alt="nadongbin" src="https://github.com/abledcorp/CodingTest/assets/56255288/319cf197-5573-474b-ad6e-77e46bcf8a59">
</p>
<p align="center">
  <em>이미지 출처 : https://m.yes24.com/Goods/Detail/91433923</em>
</p>



## 👫 팀원
<table>
  <tr>
    <th>Stella</th>
    <th>Oscar</th>
  </tr>

  <tr>
    <td>https://github.com/stellaArtois-yam</td>
    <td>https://github.com/Oscar-World</td>
  </tr>

  <tr>
    <td align="center"><img width="240" alt="stella hi-001" src="https://github.com/abledcorp/CodingTest/assets/56255288/a444eb56-30fe-4615-acfb-a8062b903fd7"></td>
    <td align="center"><img width="185" src="https://github.com/abledcorp/CodingTest/assets/108970474/fcf6e672-9bc2-4102-9096-46b3c95c1a0e"></td>
  </tr>
</table>

<br>

## 👫 스터디 룰

- PR(Pull Request) 생성 시 스터디 참여자들은 1개의 답글을 의무로 작성해야 한다.
- 스터디 참여자의 절반 이상이 Approve(승인) 시 개인 branch로 merge 할 수 있다.
- 한 챕터가 끝나면 develop branch에 개인 branch를 merge 한다.
- 모든 챕터가 끝나면 main branch에 develop branch를 merge 한다.

<br>


## 👫 Git 기초 명령어

- 각 팀원 이름을 브랜치로 하여 주어진 교재 및 타사 코딩 테스트(백준, 프로그래머스 등) 코드를 정리
    - **초기 설정**
        
        ```bash
        1. git clone {현재 레포지터리 주소}
        ```
      
        
        ```bash
        2. git checkout -b {브랜치 이름}
        ```
       - 브랜치 이름은 github branch와 동일하게 하는 것을 권장
        
        <br>
    

    - **중간 상태 확인**
        
        ```bash
        git status 
        ```
        - 본인이 만든 브랜치 상태 확인
        
        <br>
        
    
    - **코드 작성 후**
        <br><br>1. 관리하려는 목록(Staging Area)에 **추가(add)**<br>
        
        ```bash
        git add . 
        ```
        
        <br>2. 관리 파일들 **확정(commit)** 후 **로컬 저장소(Head)** 에 저장<br>
        
        ```bash
        git commit -m "지정된 컨벤션 내역을 바탕으로 작성" 
        ```
        
        <br>3. 로컬 저장소에 있는 파일들을 원격 서버(GitHub)에 **발행(push)**<br>
        
        ```bash
        git push origin {push하려는 브랜치} 
        ```
       
        
<br>

## 👫 브랜치 구조

<p align="center">
  <img width="560" src="https://github.com/abledcorp/CodingTest/assets/56255288/a0d12657-dd39-44fa-8386-036e3e16e6fb">
</p>

<br>


## 👫 프로젝트 구조

<p align="center">
  <img width="500" src="https://github.com/abledcorp/CodingTest/assets/56255288/9000abc0-80fe-4cad-9cb6-ac636cc3800f">
</p>


<br>


## 👫 Commit Message Convention
- Add : 새로운 파일 추가
- Fix : 버그 수정 (문제 풀이 틀린 부분 수정)
- Refactor : 코드 리팩토링 (알고리즘 미적용 · 성능 개선)
- Chore : 기타 수정 (오타 수정 · 줄바꿈 · 주석 추가)
- Delete : 파일 삭제
