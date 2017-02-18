# Make DB on dictionary Program

Mongo DB 를 연동하여, 어휘 분석기에서 사용할 어휘들을 수동으로 추가하는 프로그램


### DB Document Architecture

DB name : dictionary

Collection names : NOUN ( 명사 ), ADJECT( 형용사 ), ADVERB( 부사 ), VERB ( 동사 ), POSTPOSITION ( 조사 )
SUFFIX ( 어미 )

json structure { "단어" : "word" }  


## How to use

해당 프로그램을 실행하기 위해서는 mongo DB server가 실행중에 있어야 한다.
