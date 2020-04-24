package com.submission.dicoding.sensormikrokontroler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<DataClassSensors> = arrayListOf()
    private var listDetail: ArrayList<DataClassSensors> = arrayListOf()

    private fun showSelectedSensor(sensorSelected: DataClassSensors) {
        when (sensorSelected.sensor) {
            "Sensor Cahaya LDR" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[0])
            }
            "Sensor Cahaya Photodioda" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[1])
            }
            "Sensor DHT11" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[2])
            }
            "Sensor Infrared" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[3])
            }
            "Sensor Load Cell" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[4])
            }
            "Sensor MPU6050" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[5])
            }
            "Sensor MQ-2" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[6])
            }
            "Sensor PIR" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[7])
            }
            "Sensor Suara KY-037" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[8])
            }
            "Sensor Suhu LM35" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[9])
            }
            "Sensor Suhu MLX90614" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[10])
            }
            "Sensor Ultrasonik HCSR04" -> {
                showDetailRecyclerList()
                listDetail.add(SensorsData.listData[11])
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv_sensor.visibility = View.VISIBLE
        lv_sensor.setHasFixedSize(true)

        list.addAll(SensorsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_home -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        lv_sensor.layoutManager = LinearLayoutManager(this)
        val listSensorsAdapter = ListSensorsAdapter(list)
        lv_sensor.adapter = listSensorsAdapter

        listSensorsAdapter.setOnItemClickCallback(object : ListSensorsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: DataClassSensors) {
                showSelectedSensor(data)
            }
        })

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Sensor Mikrokontroler"
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

    private fun showDetailRecyclerList() {
        lv_sensor.layoutManager = LinearLayoutManager(this)
        val listSensorDetail = ListSensorDetail(listDetail)
        lv_sensor.adapter = listSensorDetail

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Deskripsi Sensor"
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onBackPressed() {
        when (showDetailRecyclerList()) {
            super.onBackPressed() -> showRecyclerList()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        recreate()
        showRecyclerList()
        return true
    }
}
