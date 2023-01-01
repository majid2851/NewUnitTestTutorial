package com.codingwithmitch.unittesting2.util

import com.codingwithmitch.unittesting2.util.DateUtil.DATE_FORMAT
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import java.text.SimpleDateFormat

class DateUtilTest
{
    private val today="01-2023"
    /*to be sure that exception of date-format is not going to be created*/
    @Test
    internal fun notThrowException_when_dateFormat_isCorrect()
    {
        assertDoesNotThrow {
            Assert.assertEquals(today,DateUtil.getCurrentTimeStamp())
        }
    }
    //-------------------------------------------------------------------
    





}