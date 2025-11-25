@echo off
setlocal

REM Creates Q1.java..Qn.java with a main template
for /L %%i in (1,1,8) do (
  >"Q%%i.java" echo /*

  >>"Q%%i.java" echo */

  >>"Q%%i.java" echo package operators.relationalOperator;
  >>"Q%%i.java" echo public class Q%%i {
  >>"Q%%i.java" echo     public static void main^(String[] args^) 
  >>"Q%%i.java" echo 	 {
  >>"Q%%i.java" echo         System.out.println^("This is Q%%i.java"^);
  >>"Q%%i.java" echo     }
  >>"Q%%i.java" echo }
)

echo Created Q1.java through Qn.java
pause
