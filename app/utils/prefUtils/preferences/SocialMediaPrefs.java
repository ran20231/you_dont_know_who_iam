package com.forsale.app.utils.prefUtils.preferences;

import com.forsale.app.utils.prefUtils.DataStoreExtensionsKt;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: SocialMediaPrefs.kt */
/* loaded from: classes3.dex */
public final class SocialMediaPrefs {

    /* renamed from: a  reason: collision with root package name */
    private final c<a> f40497a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SocialMediaPrefs.kt */
    /* loaded from: classes3.dex */
    public static final class SocialMediaTypes {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ SocialMediaTypes[] $VALUES;
        private final String key;
        public static final SocialMediaTypes YOUTUBE = new SocialMediaTypes("YOUTUBE", 0, "youtube");
        public static final SocialMediaTypes TWITTER = new SocialMediaTypes("TWITTER", 1, "twitter");
        public static final SocialMediaTypes FACEBOOK = new SocialMediaTypes("FACEBOOK", 2, "facebook");
        public static final SocialMediaTypes INSTAGRAM = new SocialMediaTypes("INSTAGRAM", 3, "instagram");

        private static final /* synthetic */ SocialMediaTypes[] $values() {
            return new SocialMediaTypes[]{YOUTUBE, TWITTER, FACEBOOK, INSTAGRAM};
        }

        static {
            SocialMediaTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SocialMediaTypes(String str, int i11, String str2) {
            this.key = str2;
        }

        public static a00.a<SocialMediaTypes> getEntries() {
            return $ENTRIES;
        }

        public static SocialMediaTypes valueOf(String str) {
            return (SocialMediaTypes) Enum.valueOf(SocialMediaTypes.class, str);
        }

        public static SocialMediaTypes[] values() {
            return (SocialMediaTypes[]) $VALUES.clone();
        }

        public final String getKey() {
            return this.key;
        }
    }

    public SocialMediaPrefs(c<a> dataStore) {
        o.i(dataStore, "dataStore");
        this.f40497a = dataStore;
    }

    public final Object a(SocialMediaTypes socialMediaTypes, zz.a<? super String> aVar) {
        return DataStoreExtensionsKt.a(this.f40497a, h3.c.f(socialMediaTypes.getKey()), "", aVar);
    }

    public final Object b(SocialMediaTypes socialMediaTypes, String str, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = DataStoreExtensionsKt.d(this.f40497a, h3.c.f(socialMediaTypes.getKey()), str, aVar);
        f11 = b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }
}
