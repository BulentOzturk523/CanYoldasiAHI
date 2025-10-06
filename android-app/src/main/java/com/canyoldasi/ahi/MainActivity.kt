// Bu dosya, uygulamanın ana aktivitesini (ana ekranını) yönetir.
package com.canyoldasi.ahi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * MainActivity, uygulamanın ana giriş noktasıdır.
 * Kullanıcı uygulamayı başlattığında bu aktivite oluşturulur ve ekranda gösterilir.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Bu fonksiyon, aktivite ilk oluşturulduğunda çağrılır.
     * Arayüzün (layout) ayarlanması ve başlangıç işlemlerinin yapılması için kullanılır.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        // Üst sınıfın onCreate metodunu çağırarak aktivitenin temel kurulumunu yap.
        super.onCreate(savedInstanceState)
        // Bu aktivite için hangi arayüz dosyasının kullanılacağını belirt. (res/layout/activity_main.xml)
        setContentView(R.layout.activity_main)
    }
}