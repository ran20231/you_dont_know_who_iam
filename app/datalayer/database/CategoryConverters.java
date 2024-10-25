package com.forsale.app.datalayer.database;

import com.google.gson.d;
import com.google.gson.reflect.a;
import kotlin.jvm.internal.o;
/* compiled from: CategoryConverters.kt */
/* loaded from: classes2.dex */
public final class CategoryConverters {
    public static final int $stable = 0;

    public final CategoryEntity toCategory(String str) {
        if (str != null) {
            return (CategoryEntity) new d().l(str, new a<CategoryEntity>() { // from class: com.forsale.app.datalayer.database.CategoryConverters$toCategory$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(CategoryEntity categoryEntity) {
        if (categoryEntity != null) {
            String t11 = new d().t(categoryEntity);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
