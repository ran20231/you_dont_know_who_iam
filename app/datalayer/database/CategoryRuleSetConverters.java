package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.google.gson.d;
import com.google.gson.reflect.a;
import kotlin.jvm.internal.o;
/* compiled from: CategoryRuleSetConverters.kt */
/* loaded from: classes2.dex */
public final class CategoryRuleSetConverters {
    public static final int $stable = 0;

    public final CategoryRuleSet.RuleSet toRuleSetConfiguration(String str) {
        if (str != null) {
            return (CategoryRuleSet.RuleSet) new d().l(str, new a<CategoryRuleSet.RuleSet>() { // from class: com.forsale.app.datalayer.database.CategoryRuleSetConverters$toRuleSetConfiguration$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(CategoryRuleSet categoryRuleSet) {
        if (categoryRuleSet != null) {
            String t11 = new d().t(categoryRuleSet);
            o.h(t11, "toJson(...)");
            return t11;
        }
        return "";
    }
}
