package com.forsale.adserver.utils;

import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
import wz.h;
/* compiled from: LocaleManager.kt */
/* loaded from: classes2.dex */
public final class LocaleManager implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final LocaleManager f20849a = new LocaleManager();

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f20850b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f20851c;

    /* renamed from: d  reason: collision with root package name */
    private static final h f20852d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f20853e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocaleManager.kt */
    /* loaded from: classes2.dex */
    public static final class Languages {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ Languages[] $VALUES;
        public static final a Companion;
        private static final Map<String, Languages> map;
        private final String value;
        public static final Languages ARABIC = new Languages("ARABIC", 0, SearchPlaceholderKeywordEntity.AR);
        public static final Languages ENGLISH = new Languages("ENGLISH", 1, SearchPlaceholderKeywordEntity.EN);

        /* compiled from: LocaleManager.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private static final /* synthetic */ Languages[] $values() {
            return new Languages[]{ARABIC, ENGLISH};
        }

        static {
            int e11;
            int d11;
            Languages[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
            Languages[] values = values();
            e11 = i0.e(values.length);
            d11 = o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (Languages languages : values) {
                linkedHashMap.put(languages.value, languages);
            }
            map = linkedHashMap;
        }

        private Languages(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<Languages> getEntries() {
            return $ENTRIES;
        }

        public static Languages valueOf(String str) {
            return (Languages) Enum.valueOf(Languages.class, str);
        }

        public static Languages[] values() {
            return (Languages[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    static {
        h a11;
        h a12;
        a11 = d.a(new g00.a<b0<String>>() { // from class: com.forsale.adserver.utils.LocaleManager$languageLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<String> invoke() {
                return new b0<>();
            }
        });
        f20851c = a11;
        a12 = d.a(LocaleManager$preferenceChangeListener$2.f20855a);
        f20852d = a12;
        f20853e = 8;
    }

    private LocaleManager() {
    }

    private final SharedPreferences.OnSharedPreferenceChangeListener g() {
        return (SharedPreferences.OnSharedPreferenceChangeListener) f20852d.getValue();
    }

    public final String b() {
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                kotlin.jvm.internal.o.w("preference");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("current_language", "");
            if (string == null) {
                return "";
            }
            return string;
        }
        return Languages.ARABIC.getValue();
    }

    public final String d() {
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.o.w("preference");
            sharedPreferences = null;
        }
        String string = sharedPreferences.getString("DEVICE_ID", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final b0<String> f() {
        return (b0) f20851c.getValue();
    }

    public final int h() {
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.o.w("preference");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt("SHUFFLE_FACTOR", 3);
    }

    public final void i(SharedPreferences sharedPreferences, String currentLanguage, String deviceId) {
        kotlin.jvm.internal.o.i(sharedPreferences, "sharedPreferences");
        kotlin.jvm.internal.o.i(currentLanguage, "currentLanguage");
        kotlin.jvm.internal.o.i(deviceId, "deviceId");
        f20850b = sharedPreferences;
        k(currentLanguage);
        l(deviceId);
    }

    public final boolean j() {
        return kotlin.jvm.internal.o.d(b(), Languages.ARABIC.getValue());
    }

    public final void k(String language) {
        kotlin.jvm.internal.o.i(language, "language");
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                kotlin.jvm.internal.o.w("preference");
                sharedPreferences = null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("current_language", language);
            edit.apply();
        }
    }

    public final void l(String deviceId) {
        kotlin.jvm.internal.o.i(deviceId, "deviceId");
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.o.w("preference");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("DEVICE_ID", deviceId);
        edit.apply();
    }

    public final void m(int i11) {
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.o.w("preference");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("SHUFFLE_FACTOR", i11);
        edit.apply();
    }

    @d0(Lifecycle.Event.ON_DESTROY)
    public final void onAppDestroy() {
        SharedPreferences sharedPreferences = f20850b;
        if (sharedPreferences == null) {
            kotlin.jvm.internal.o.w("preference");
            sharedPreferences = null;
        }
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(g());
    }
}
