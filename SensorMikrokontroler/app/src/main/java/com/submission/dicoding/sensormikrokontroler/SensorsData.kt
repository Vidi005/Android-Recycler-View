package com.submission.dicoding.sensormikrokontroler

object SensorsData {
    private val sensorTypes = arrayOf("Sensor Cahaya LDR",
        "Sensor Cahaya Photodioda",
        "Sensor DHT11",
        "Sensor Infrared",
        "Sensor Load Cell",
        "Sensor MPU6050",
        "Sensor MQ-2",
        "Sensor PIR",
        "Sensor Suara KY-037",
        "Sensor Suhu LM35",
        "Sensor Suhu MLX90614",
        "Sensor Ultrasonik HCSR04")

    private const val sensorDescription1 = "Sensor cahaya LDR (Light Dependent Resistor) adalah salah satu komponen resistor yang nilai resistansinya akan berubah-rubah sesuai dengan intensitas cahaya. Nilai resistansi sensor ini sangat bergantung pada sebuah intensitas cahaya. Semakin banyak cahaya yang mengenai sensor tersebut maka akan semakin menurun nilai resistansinya. Sebaliknya jika semakin sedikit cahaya yang mengenai resistor maka nilai resistansinya akan semakin besar sehingga arus listrik yang mengalir akan terhambat.\n" +
            "\nSpesifikasi Sensor LDR:\n" +
            "-\tTegangan Kerja (Vcc)\t: 0V - 5V\n" +
            "-\tTegangan Referensi  \t: Vcc V\n" +
            "-\tSuhu Operasi        \t: -40 - 85\u2103\n" +
            "-\tDaya                \t: 260 mV\n"
    private const val sensorDescription2 = "Photodioda merupakan komponen semi konduktor yang peka terhadap cahaya, Photodioda terbagi dua yaitu photodioda yang peka terhadap cahaya yang tampak dan photodioda yang peka terhadap cahaya yang tak tampak. Di pasaran biasanya photodioda yang peka terhadap cahaya yang tampak berwana bening dan photodioda yang peka terhadap cahaya yang tidak tampak (IR) bisanya dipasaran berwarna hitam.\n" +
            "\nSpesifikasi Sensor Photodioda:\n" +
            "-\tArea Sensitivitas\t: A = 7,5 mm^2\n" +
            "-\tSudut deteksi    \t: 65\u00b0\n" +
            "-\tPaket Plastik TO-92 dengan filter IR\n" +
            "-\tFilter didesain untuk transmisi 950 nm\n"
    private const val sensorDescription3 = "Sensor DHT11 adalah module sensor yang berfungsi untuk mensensing objek suhu dan kelembaban yang memiliki output tegangan analog yang dapat diolah lebih lanjut menggunakan mikrokontroler. Module sensor ini tergolong kedalam elemen resistif seperti perangkat pengukur suhu seperti contohnya yaitu NTC. Kelebihan dari module sensor ini dibanding module sensor lainnya yaitu dari segi kualitas pembacaan data sensing yang lebih responsif yang memliki kecepatan dalam hal sensing objek suhu dan kelembaban, dan data yang terbaca tidak mudah terinterverensi.\n" +
            "\nSpesifikasi Sensor DHT11:\n" +
            "-\tTegangan Masukkan   \t: 5 Vdc\n" +
            "-\tRentang Temperatur  \t: 0 - 50\u2103 kesalahan ±2\u2103\n" +
            "-\tKelembaban          \t: 20 - 90% RH ±5% RH error\n"
    private const val sensorDescription4 = "Sensor IR adalah sebuah sensor yang dapat mendeteksi rintangan menggunakan cahaya inframerah yang dipantulkan. Sensor ini mempunyai dua bagian utama yaitu IR emitter dan IR receiver. Emitter bertugas memantulkan inframerah ke rintangan atau objek kemudian akan dipantulkan dan diterima oleh receiver. Ketika inframerah mengenai sebuah objek, kondisinya akan LOW dan begitu juga sebaliknya. Sensor ini dapat digunakan untuk robot line follower, robot halang rintang, atau untuk keperluan alarm.\n" +
            "\nSpesifikasi Sensor Infrared:\n" +
            "-\tPort OUT dapat dihubungkan langsung ke port I/O mikrokontroler\n" +
            "-\tJarak Deteksi       \t: 2 ~ 30 cm, dapat diatur\n" +
            "-\tSudut Deteksi       \t: 35\u00b0\n" +
            "-\tTegangan Masukkan   \t: 3 - 5 Vdc\n" +
            "-\tMenggunakan Komparator LM393\n" +
            "-\tUkuran Fisik        \t: 3,1 cm * 1,5 cm\n"
    private const val sensorDescription5 = "Load cell merupakan sensor transduser berat dapat merubah tekanan (force) menjadi sinyal listrik. Terdapat tiga cara load cell mengubah nilai tekanan(force) yang diterima menjadi nilai pengukuran, yaitu hidraulic load cell, pneumatic load cell dan strain gauge load cell. Pada sistem timbangan digital ini digunakan strain gauge load cell. Keluaran dari sensor ini berupa tegangan dalam orde mV yang terbaca terhadap perubahan nilai resistansi yang merepretasikan berat benda.\n" +
            "\nSpesifikasi Sensor Load Cell:\n" +
            "-\tKapasitas Beban \t: 3 - 120 kg\n" +
            "-\tMaterial        \t: Alumunium-alloy\n" +
            "-\tTipe Balok Paralel\n" +
            "-\tNilai Ketahanan \t: IP65\n"
    private const val sensorDescription6 = "Module MPU6050 merupakan sensor yang berfungsi sebagai accelerometer sekaligus gyroscope yang dipackage kedalam 1 module yang kompatibel dengan Arduino.\nAccelerometer merupakan sensor berfungsi untuk mengukur percepatan suatu benda atau objek yang bergerak yang bersifat dynamic maupun static.\nGyroscope merupakan sensor yang berfungsi untuk menentukan orientasi gerak dengan bertumpu pada roda yang berotasi dengan cepat pada sumbu yang berdasarkan momentum sudut.\n" +
            "\nSpesifikasi Sensor Modul MPU6050:\n" +
            "-\tTegangan operasional di range antara 3Vdc – 5Vdc\n" +
            "-\tMenggunakan antarmuka komunikasi I2C (SCL, SDA)\n" +
            "-\tRange dari Gyroscope\t: 250 500 1000 2000 / s\n" +
            "-\tChip built-in 16bit AD converter, 16-bit data output\n" +
            "-\tDifungsikan sebagai sensor accelerometer dan gyroscope\n" +
            "-\tUkuran modul        \t: 2.2cm x 1.7cm\n"
    private const val sensorDescription7 = "Sensor MQ-2 adalah sensor yang digunakan untuk mendeteksi gas LPG, i-butana, propana, metana, alkohol, hidrogen dan asap. Kata datasheet, inti dari MQ-2 adalah material yang sensitif terhadap konsentrasi gas yang tersusun dari senyawa SnO2 atau dalam istilah kita disebut Timah (IV) Oksida. Material ini memiliki karakteristik akan berubah konduktivitasnya seiring dengan perubahan konsentrasi gas di sekitarnya.\n" +
            "\nSpesifikasi Sensor MQ-2:\n" +
            "-\tSensitivitas Baik untuk Mendeteksi Gas yang Mudah Terbakar dengan Jangkauan Lebar\n" +
            "-\tSensitivitas Tinggi pada LPG, Propana, dan Hidrogen\n" +
            "-\tTahan Lama dan Murah\n" +
            "-\tSirkuit Driver yang Sederhana\n"
    private const val sensorDescription8 = "PIR (Passive Infrared Receiver) merupakan sebuah sensor berbasiskan infrared. Akan tetapi, tidak seperti sensor infrared kebanyakan yang terdiri dari IR LED dan fototransistor. PIR tidak memancarkan apapun seperti IR LED. Sesuai dengan namanya ‘Passive’, sensor ini hanya merespon energi dari pancaran sinar inframerah pasif yang dimiliki oleh setiap benda yang terdeteksi olehnya. Benda yang bisa dideteksi oleh sensor ini biasanya adalah tubuh manusia. Di dalam sensor PIR ini terdapat bagian-bagian yang mempunyai perannya masing-masing, yaitu Fresnel Lens, IR Filter, Pyroelectric sensor, amplifier, dan comparator.\n" +
            "\nSpesifikasi Sensor PIR:\n" +
            "-\tMendeteksi Manusia Sekitar Sampai 30 kaki\n" +
            "-\tTegangan Sumber Sampai dengan 12 mA @3V, 23 mA @5V\n" +
            "-\t3-pin SIP Header Siap dipasang pada Breadboard\n" +
            "-\tMudah digunakan pada beberapa Mikrokontroler\n" +
            "-\tDimensi\t: 35,8 x 25,4 x 20,3 in\n"
    private const val sensorDescription9 = "Sensor suara merupakan sensor yang dapat mengubah besaran suara menjadi besaran listrik dimana nilai diperoleh dari besarnya gelombang suara yang masuk. Sensor suara KY-037 ini sudah dalam bentuk modul. Jenis ini dapat digunakan pada rangkaian anlog output dan digital output pada mikrokontroler seperti Arduino.\n" +
            "\nSpesifikasi Sensor KY-037:\n" +
            "-\tTegangan Operasi\t: 3,3 V - 5 V\n" +
            "-\tModel Keluaran\t: Digital Switch Output (0 and 1, High or Low Level)\n" +
            "-\tDilengkapi Lubang Sekrup untuk Pemasangan\n"
    private const val sensorDescription10 = "Sensor LM35 merupakan sebuah sensor suhu dengan harga yang relatif murah dan output-nya sudah berupa tegangan yang sudah linear. Menurut datasheet LM35, untuk kenaikan 1 derajat Celcius akan mengakibatkan perubahan 10mV terhadap output tegangannya. Dimana saat suhu 0° Celcius sensor ini mempunyai tegangan offset sebesar 0 V.\n" +
            "\nSpesifikasi Sensor LM35:\n" +
            "-\tFaktor Skala Linear +10,0 mV/\u2103\n" +
            "-\tAkurasi 0,5\u2103 pada +25\u2103\n" +
            "-\tTegangan Operasi antara 4 - 30 Volt\n" +
            "-\tRentang Suhu -55\u2103 - 150\u2103\n" +
            "-\tSelf-heating yang rendah, 0.09\u2103 di udara\n" +
            "-\tImpedansi Keluaran yang Rendah 0,1 Ω pada Beban 1 mA\n"
    private const val sensorDescription11 = "MLX90614 merupakan sensor suhu contactless (nirsentuh). Artinya untuk mengukur temperatur suatu benda, sensor tidak perlu bersentuhan langsung dengan benda tersebut. Cukup arahkan sensor ke objek yang ingin diukur suhunya. Sensor ini bekerja dengan menyerap sinar inframerah yang dipancarkan suatu benda.\n" +
            "\nSpesifikasi Sensor MLX90614:\n" +
            "-\tUkuran Kecil, Harga Murah\n" +
            "-\tRentang Suhu untuk Sensor   \t: -40 - 125\u2103\n" +
            "-\tRentang Suhu untuk Obyek    \t: -40 - 125℃\n" +
            "-\tAkurasi Tinggi pada 0,5\u2103 dalam Jangkauan Temperatur yang Luas\n" +
            "-\tKalibrasi Akurasi yang Tinggi (Medis)\n" +
            "-\tResolusi Pengukuran 0,02℃\n" +
            "-\tKompatibel dengan SMBus Digital Interface\n" +
            "-\tTersedia Versi 3V dan 5V\n" +
            "-\tMode Hemat Daya\n"
    private const val sensorDescription12 = "Sensor ultrasonik HCSR04 adalah sensor yang berfungsi untuk merubah besaran fisis (suara) menjadi besaran listrik maupun sebaliknya yang dikonversi menjadi jarak. Konsep dasar dari sensor ini yaitu memanfaatkan prinsip pemantulan gelombang suara yang dapat diaplikasikan untuk menghitung jarak benda dengan frekuensi yang ditentukan sesuai dengan sumber oscilator. Disebut sebagai sensor ultrasonic dikarenakan sensor ini mengaplikasikan gelombang ultrasonik sebagai trandusernya.\n" +
            "\nSpesifikasi Sensor HCSR04:\n" +
            "-\tJarak deteksi antara 2 cm – 300 cm\n" +
            "-\tTingkat kepresisisan pengukuran jarak ±3 mm\n" +
            "-\tTegangan operasional 5 Vdc\n" +
            "-\tSudut sensor < 15 derajat\n" +
            "-\tKonsumsi arus berkisar 2 mA\n" +
            "-\tDimensi modul 45mm x 20mm\n"

    private val sensorDescriptions = arrayOf(
        sensorDescription1,
        sensorDescription2,
        sensorDescription3,
        sensorDescription4,
        sensorDescription5,
        sensorDescription6,
        sensorDescription7,
        sensorDescription8,
        sensorDescription9,
        sensorDescription10,
        sensorDescription11,
        sensorDescription12)

    private val sensorImages = arrayOf<Int>(R.drawable.sensor_ldr,
        R.drawable.sensor_photodioda,
        R.drawable.sensor_dht11,
        R.drawable.sensor_ir,
        R.drawable.sensor_loadcell,
        R.drawable.sensor_mpu6050,
        R.drawable.sensor_mq2,
        R.drawable.sensor_pir,
        R.drawable.sensor_ky037,
        R.drawable.sensor_lm35,
        R.drawable.sensor_mlx90614,
        R.drawable.sensor_hcsr04)

    val listData: ArrayList<DataClassSensors>
        get() {
            val list = arrayListOf<DataClassSensors>()
                        for (position in sensorTypes.indices) {
                val name = DataClassSensors("","")
                name.sensor = sensorTypes[position]
                name.description = sensorDescriptions[position]
                name.image = sensorImages[position]
                list.add(name)
            }
            return list
        }
}
