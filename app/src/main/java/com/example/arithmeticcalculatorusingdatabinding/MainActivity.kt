package com.example.arithmeticcalculatorusingdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.arithmeticcalculatorusingdatabinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.setVariable(BR.onButtonClick, this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.button_addition -> {
                if (!TextUtils.isEmpty(activityMainBinding.number1Edittext.text) && (!TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)))
                {
                    activityMainBinding.textViewOutput.text = ((number_1_edittext.text.toString().toDouble()) + (number_2_edittext2.text.toString().toDouble())).toString()
                }
                else {
                    if (TextUtils.isEmpty(activityMainBinding.number1Edittext.text)) {
                        activityMainBinding.number1Edittext.error = resources.getString(R.string.number_1_error)
                    } else if (TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)) {
                        activityMainBinding.number2Edittext2.error = resources.getString(R.string.number_2_error)

                    }
                }
            }
                R.id.button_subtract->{
                    if (!TextUtils.isEmpty(activityMainBinding.number1Edittext.text) && (!TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)))
                    {
                        activityMainBinding.textViewOutput.text = ((number_1_edittext.text.toString().toDouble()) - (number_2_edittext2.text.toString().toDouble())).toString()
                    }
                    else {
                        if (TextUtils.isEmpty(activityMainBinding.number1Edittext.text)) {
                            activityMainBinding.number1Edittext.error = resources.getString(R.string.number_1_error)
                        } else if (TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)) {
                            activityMainBinding.number2Edittext2.error = resources.getString(R.string.number_2_error)

                        }
                    }
                }
                R.id.button_multiplication->{
                    if (!TextUtils.isEmpty(activityMainBinding.number1Edittext.text) && (!TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)))
                    {
                        activityMainBinding.textViewOutput.text = ((number_1_edittext.text.toString().toDouble()) * (number_2_edittext2.text.toString().toDouble())).toString()
                    }
                    else {
                        if (TextUtils.isEmpty(activityMainBinding.number1Edittext.text)) {
                            activityMainBinding.number1Edittext.error = resources.getString(R.string.number_1_error)
                        } else if (TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)) {
                            activityMainBinding.number2Edittext2.error = resources.getString(R.string.number_2_error)

                        }
                    }
                }
                R.id.button_divison->{
                    if (!TextUtils.isEmpty(activityMainBinding.number1Edittext.text) && (!TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)))
                    {
                        activityMainBinding.textViewOutput.text = ((number_1_edittext.text.toString().toDouble()) / (number_2_edittext2.text.toString().toDouble())).toString()
                    }
                    else {
                        if (TextUtils.isEmpty(activityMainBinding.number1Edittext.text)) {
                            activityMainBinding.number1Edittext.error = resources.getString(R.string.number_1_error)
                        } else if (TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)) {
                            activityMainBinding.number2Edittext2.error = resources.getString(R.string.number_2_error)

                        }
                    }
                }
                R.id.button_modulus->{
                    if (!TextUtils.isEmpty(activityMainBinding.number1Edittext.text) && (!TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)))
                    {
                        activityMainBinding.textViewOutput.text = ((number_1_edittext.text.toString().toDouble()) % (number_2_edittext2.text.toString().toDouble())).toString()
                    }
                    else {
                        if (TextUtils.isEmpty(activityMainBinding.number1Edittext.text)) {
                            activityMainBinding.number1Edittext.error = resources.getString(R.string.number_1_error)
                        } else if (TextUtils.isEmpty(activityMainBinding.number2Edittext2.text)) {
                            activityMainBinding.number2Edittext2.error = resources.getString(R.string.number_2_error)

                        }
                    }
                }
                R.id.button_reset->{
                    activityMainBinding.textViewOutput.text = null
                    activityMainBinding.number1Edittext.text = null
                    activityMainBinding.number2Edittext2.text = null
                }

            }


        }
    }
