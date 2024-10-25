package com.forsale.adserver.utils;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: LocaleManager.kt */
/* loaded from: classes2.dex */
final class LocaleManager$preferenceChangeListener$2 extends Lambda implements g00.a<SharedPreferences.OnSharedPreferenceChangeListener> {

    /* renamed from: a  reason: collision with root package name */
    public static final LocaleManager$preferenceChangeListener$2 f20855a = new LocaleManager$preferenceChangeListener$2();

    LocaleManager$preferenceChangeListener$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SharedPreferences sharedPreferences, String str) {
        if (str != null && str.hashCode() == 1906777950 && str.equals("current_language")) {
            LocaleManager localeManager = LocaleManager.f20849a;
            localeManager.f().postValue(localeManager.b());
        }
    }

    @Override // g00.a
    /* renamed from: c */
    public final SharedPreferences.OnSharedPreferenceChangeListener invoke() {
        SharedPreferences sharedPreferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.forsale.adserver.utils.a
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                LocaleManager$preferenceChangeListener$2.e(sharedPreferences2, str);
            }
        };
        sharedPreferences = LocaleManager.f20850b;
        if (sharedPreferences == null) {
            o.w("preference");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return onSharedPreferenceChangeListener;
    }
}
