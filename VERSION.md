# Who's the BOSS      
## Список версий

* <b>0.22 - 13/07/21</b>
1. Добавлены: MT-2-A, SD-1-A, HM-2W, CEB-3(digital), PH1-R, OC-2 (digital)
2. CH-1 и CE-5 аналоговые и цифровые версии сделаны раздельно
3. Исправлены / добавлены годы
* <b>Версия 0.21 - 19/01/21</b>
1. Добавлена 10-я серия, добавлены описания для 10-й серии
* <b>Версия 0.20 - 10/01/21</b>
1. Изменены конструкторы в Pedal, раньше было 4 перегруженных, теперь 1 универсальный конструктор
2. Добавлены описания
* <b>Версия 0.19 - 06/01/21</b>
1. Изменен конструктор для Pager (super был deprecated)
2. Заменены deprecated getFragmentManager
3. По всему коду глобально удалено лишнее 
* <b>Версия 0.18 - 06/01/21</b>
1. Добавлен "Discontinued" для отображения года
2. Описание для RT-20
3. Исправления в PedalFragment — теперь открытое описание делит экран поровну с изображением
* <b>Версия 0.17 - 04/01/21</b>
1. Ресайз некоторых картинок, добавил описание для ce-20
* <b>Версия 0.16 - 04/01/21</b>
1. Картинки для 20 серии переделаны в .png, добавлены маленькие картинки
2. Добавлено отображение описания show/hide, изменены все конструкторы — теперь в объект добавляется ссылка на описание или 0, если описания нет
3. Для ds1-4a теперь год отображается, как "2017"
* <b>Версия 0.15 - 04/01/21</b>
1. Добавлена 20-я серия (16 твин педалей)
2. Добавлен ReadMe и Список версий
* <b>Версия 0.14 - 30/12/20</b>
1. Увеличен размер заголовка спиннера (выпадающего меню)
* <b>Версия 0.13 - 29/12/20</b>
1. Исправлена картинка на Touch Wah
2. Добавлена картинка на Digital Dimension DC-3
* <b>Версия 0.12 - 29/12/20</b>
1. Добавлено отображение списка по категориям
* <b>Версия 0.11 - 28/12/20</b>
1. Увеличен размер превьюшек
* <b>Версия 0.10 - 27/12/20</b>
1. Добавлен механизм формирования листа по категории
2. Добавлены картинки
* <b>Версия 0.09 - 23/12/20</b>
1. Некоторые картинки заменены на лучшее качество
* <b>Версия 0.08 - 21/12/20</b>
1. Добавлены картинки
* <b>Версия 0.07 - 21/12/20</b>
1. Добавлен Pager, теперь при открытии фрагмента PedalFragment можно листать вправо/влево
* <b>Версия 0.06 - 20/12/20</b>
1. Добавлены категории
2. Начало работы с ViewPager
* <b>Версия 0.05 - 18/12/20</b>
1. Добавлены все маленькие картинки для листа. Добавлены соответствующие методы
2. Переделан Position. Теперь храниться в ViewModel, теперь при повороте экрана на PedalFragment просто вызывается деф конструктоор, position вытягивается из MainView. Раньше вылетала с NPE
3. Добавлено: если startYear = 0, значит ставится "?"
* <b>Версия 0.04 - 18/12/20</b>
1. Добавлены все картинки
2. Добавлены картинки в листе, пока большие, подтормаживает
3. Добавлено отображение года
4. Картинка сделана на весь экран (в не зависимости от её размера)
* <b>Версия 0.03 - 18/12/20</b>
1. ViewModel работает
* <b>Версия 0.02 - 14/12/20</b>
1. Добавлен ViewModel — не работает
* <b>Версия 0.01 - 14/12/20</b>
1. Добавлен адаптер и фрагменты
