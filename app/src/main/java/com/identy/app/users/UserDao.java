package com.identy.app.users;

import java.util.List;

/* loaded from: classes2.dex */
public interface UserDao {
    void delete(IdentyUser identyUser);

    List<IdentyUser> findByEmail(String str);

    IdentyUser findByName(String str);

    List<IdentyUser> getAll();

    void insertAll(IdentyUser... identyUserArr);

    List<IdentyUser> loadAllByIds(int[] iArr);
}
