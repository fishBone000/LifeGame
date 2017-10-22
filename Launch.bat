@echo off
:start
java LifeGame
set /p choice=Restart game? (Y/N)
if %choice%==Y goto start
if %choice%==y goto start
