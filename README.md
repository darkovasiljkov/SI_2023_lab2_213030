# Втора лабораториска вежба по Софтверско инженерство

## Дарко Васиљков, бр. на индекс 213030

<h3> Control Flow Graph</h3>

![Screenshot_4](https://github.com/darkovasiljkov/SI_2023_lab2_213030/assets/93830641/3f78296b-f812-48df-9bbe-2633a2c5c1b5)


<h3>Цикломатска комплексност</h3>

Цикломатската комплексност може да се најде од графот горе - Control Flow Graph. Ги гледаме прво регионите, каде во овој случај се 10 региони и потоа додаваме + 1 за целиот граф добиваме 11 (ФОРМУЛА:ц. комплексност = број на предикатни јазли + 1). Оттука цикломатската комплексност изнесува 11. 

<h3> Тест случаи според критериумот Every Branch (5 случаи)</h3>
  
Случај број 1. Kога user==null (throw exception).
Случај број 2. Kога username==null, koga password има спец. карактер, а внесен е соодветен email.
Слуачј број 3. - Ист username и password (се поминува test примерот со @ и .)
Случај број 4. - Password со празно место " ", валиден e-mail, валиден username.
Случај број 5. - Password без специјален карактер.


<h3> Тест случаи според критериумот MultipleCondition(4 случаи) </h3>
  
( Multiple Condition: if (user==null || user.getPassword()==null || user.getEmail()==null){
 throw new RuntimeException("Mandatory information missing!"); } )
  
Случај број 1. T-X-X -> Со ова покажуваме дека го исполнуваме само првиот услов т.е user==null.

Случај број 2. F-T-X -> Во овој случај го исполнуваме вториот услов, т.е user.getPassword()==null.

Случај број 3. F-F-T -> Во овој случај го исполнуваме третиот услов т.е user.getEmail()==null 

Случај број 4. F-F-F -> Во овој случај ниту еден од условите не се исполнува (ниту за user, password ни getEmail==null).

  
 
<h3>Објаснување на напишаните unit tests</h3>
  
1. Kога user==null (throw exception) - поради тоа што user=null ќе влезе само во првиот if ќе фрли исклучок и одма ќе премине на крајот.
2. User(null,"Darko21?","darko@gmail.com"); поради тоа што username=null при оваа проверка кај ифот ќе се сетира и ќе оди се до ifot тука и ќе падне на крајот.
3. Во трет случај User("darko","darko","darko@gmail.com"); поради тоа што има исти карактери во username и password тука ќе падне исклучокот и ќе се врати на крајот на функцијата).
4. User("darko","Darko da","darko@gmail.com"); даден пример е каде имаме ставено " " на passwordot, ќе се изминат ifovite се додека не дојде до проверката за " " и тоа внатре нема да го изврши ќе оди до крајот на функцијата (27 крај).
5. User("darko","Darkodarko","darko@gmail.com"); сега на passwordot немаме " ", ќе се помине и делот каде се проверува дали нема space, застанувајќи кај делот за проверка на спец. знак (така што ќе се задоволи Every branches критериумот).

  
TXX - Тука ќе биднеме веднаш исфрлени на exception поради тоа што user = null.

FTX - Пример: User(darko,null,darko@gmail.com) - со ова го исполнуваме вториот услов (во if делот за пасворд)

FFT - Пример: User(darko,Darko21?!,null) - се исполнува трет услов (во if делот за email немаме ништо)

FFF - Пример: User(darko, Darko21?1, darko@gmail.com) - ниту еден null немаме па затоа не е исполнет ниту еден услов од if

  
  
  
  
