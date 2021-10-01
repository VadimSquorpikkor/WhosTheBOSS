package com.squorpikkor.app.whostheboss.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.squorpikkor.app.whostheboss.Device;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface DeviceDAO {
    @Query("SELECT * FROM devices")
    LiveData<List<Device>> getAllDevices();

    /**Этот хитрый придуманный мною селект делает следующую штуку:
     * 1. Для начала: category хранит категорию в виде int (overdrive==4, chorus==2048 и т.д.)
     * 2. все значения — это степени 2-ки
     * 3. Если у устройства 2 и более категорий, то category будет равна сумме значений (overdrive+chorus=4+2048=2052)
     * 4. Чтобы селект вернул, например, все овердрайвы, он выбирает только те строки, значение category которых удовлетворяет: category%(4*2) >= 4
     * 5. Чтобы понять, почему это работает, надо попробовать сделать это с 10-ми числами, т.е. значения будут 1, 10, 100, 1000...
     * Тогда несколько категорий будут в виде например 1010, где очевидно, что это 10-я категория и 1000-я вместе.
     * А если из множества всех чисел нужно найти такие, в состав которых входит 10-ка, то нужно оставить только те, у которых второй разряд равен 1*/
//    @Query("SELECT * FROM devices WHERE category >= :cat AND category < :cat*2") //не работает
//    @Query("SELECT * FROM devices WHERE category >= :cat AND category%:cat >= :cat") //не работает
//    @Query("SELECT * FROM devices WHERE category >= :cat AND category%(:cat*2) >= :cat") //РАБОТАЕТ
    @Query("SELECT * FROM devices WHERE category%(:cat*2) >= :cat")
    LiveData<List<Device>> getDevicesByCategory(int cat);

    @Insert
    void insertAll(Device... devices);
}
