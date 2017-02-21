package com.example.rezwana.personalassistant.Model;

import android.provider.BaseColumns;

/**
 * Created by user on 1/18/2017.
 */
public class TaskContract {
    public static final String DB_NAME = "task.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";

    }
}
