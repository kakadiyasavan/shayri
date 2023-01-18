package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] car = new String[] {"हमारी हैसियत का अंदाज़ा तुम ये जान के लगा लो,\n" +
            "हम कभी उनके नहीं होते जो हर किसी के हो गए।","हमें शायर समझ के यूँ नजर अंदाज मत करिये,\n" +
            "नजर हम फेर ले तो हुस्न का बाजार गिर जायेगा।","इससे ज़्यादा तुझे और कितना करीब लाऊँ मैं,\n" +
            "कि तुझे दिल में रख कर भी मेरा दिल नहीं भरता।","हक़ीक़त ना सही तुम ख़्वाब बन कर मिला करो,\n" +
            "भटके मुसाफिर को चांदनी रात बनकर मिला करो।","भरे बाजार से अक्सर मैं खाली हाथ आया हूँ,\n" +
            "कभी ख्वाहिश नहीं होती कभी पैसे नहीं होते।","तलब करें तो मैं अपनी आँखें भी उन्हें दे दूँ,\n" +
            "मगर ये लोग मेरी आँखों के ख्वाब माँगते हैं।","Rolls-इतना बेताब न हो मुझसे बिछड़ने के लिए,\n" +
            "तुझे आँखों से नहीं मेरे दिल से जुदा होना है।","बहुत दर्द हैं ऐ जान-ए-अदा तेरी मोहब्बत में,\n" +
            "कैसे कह दूँ कि तुझे वफ़ा निभानी नहीं आती।","कितना लुत्फ ले रहे हैं लोग मेरे दर्द-ओ-ग़म का,\n" +
            "ऐ इश्क़ देख तूने तो मेरा तमाशा ही बना दिया।"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        RecyclerAdapter adapter = new RecyclerAdapter(MainActivity.this,car);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}