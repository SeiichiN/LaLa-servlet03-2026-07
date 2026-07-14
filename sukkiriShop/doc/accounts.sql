-- h2database
-- データベース名: sukkiriShop
-- ユーザー名: sa
-- パスワード: なし

-- テーブル名: ACCOUNTS

CREATE TABLE ACCOUNTS (
  USER_ID VARCHAR(10) PRIMARY KEY,
  PASS    VARCHAR(10) NOT NULL,
  MAIL    VARCHAR(100) NOT NULL,
  NAME    VARCHAR(40) NOT NULL,
  AGE     INT NOT NULL
);

-- 初期データ
INSERT INTO ACCOUNTS
  (USER_ID, PASS, MAIL, NAME, AGE)
VALUES
  ('minato', 
   '1234', 
   'yusuke.minato@miyabilink.jp', 
   '湊 雄輔', 
   23);

