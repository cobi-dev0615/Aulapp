package com.identy.app.users;

import androidx.room.RoomDatabase;

/* loaded from: classes2.dex */
public abstract class IdentyAppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
