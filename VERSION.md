# Who's the BOSS      
## Список версий

* <b>0.31 - 30/05/22</b>
1. При старте загружается вариант ресайкла выбранный последним (сохранение выбора типа). Обновил SaveLoad. Обновил импорты
* <b>0.30 - 17/12/21</b>
1. Добавлен список избранных (WishList), сделана кнопка переключающая вид списка все/только избранные. Список сохраняется и восстанавливается после паерезапуска приложения
2. Добавлен список уже купленных (HaveList), сделана кнопка переключающая вид списка все/только купленные. Список сохраняется и восстанавливается после паерезапуска приложения
3. Исправления/улучшения в коде, в картинках
4. Для GridLayout картинки сделаны большого разрешения — тормозит, но красиво, потоп сделать промежуточного разрешения
5. Добавлен FZ-1W
6. Добавлен SaveLoad
7. Исправлена иконка приложения: была не квадратная, на некоторых устройствах растягивалась по горизонтали
* <b>0.29 - 15/12/21</b>
1. Добавлено раздельное отображение картинок для устройств с одинаковым коротким именем (например T-Wah и Touch Wah — обе TW-1), разница задается в параметре конструктора для короткого имени: добавлением "_2", само добавление, конечно, не отображается при показе короткого имени
2. Заработала смена стилей списка: список/сетка
3. Работающее описание. Сам механизм сделан так, что описание не добавляется в конструкторе, а путь к ресурсу получается из короткого имени, таким образом новые описания не нужно добавлять к девайсу, они будут подхвачены автоматом при их наличии (если добавить новое описание в strings.xml, то ничего не нужно ещё добавлять в коде, это описание уже автоматом будет присваиваться к педали)
* <b>0.28 - 13/12/21</b>
1. Добавлено отображение годов в списке устройств
2. Добавлен лэйаут-сетка (grid) шириной 3 устройства. Добавлена кнопка переключения стилей лэйаутов (список/сетка). Сделана вся реализация, пока не работает кнопка
* <b>0.27 - 13/12/21</b>
1. Возврат от БД к ArrayList. Сделан фильтр категорий
* <b>0.25 - 01/10/21</b>Глобальное изменение продолжение. 100 файлов
1. Отображение в списке всех устройств
2. Изменение имени некоторых картинок (~40шт)
3. Сделан механизм выборки списка устройств из БД по категории (сложность в том, что категорий у одного устройства может быть несколько). Решение: разные категории — это инты по степеням двойки, которые могут складываться. Выборка — одной SQL строкой (см. код)
* <b>0.24 - 01/10/21</b>Глобальное изменение.
1. Полностью смена архитектуры: хранение данных теперь в БД, работа через Room. Это пока ещё не совсем работающее приложение
2. Новый фрагмент, адаптер (теперь на основе RecyclerView)
3. Добавлены классы DataEntity, DeviceDAO, DeviceDatabase, App, Device, Utils
4. Теперь имена ресурсов не хранятся в БД, а формируются в адаптере, теперь в конструкторе Device не 9 параметров, а только 4
5. Добавлена картинка приложения
* <b>0.23 - 23/07/21</b>
1. Начал делать  favorite
2. Картинки для MT-2-A, SD-1-A, HM-2W
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
