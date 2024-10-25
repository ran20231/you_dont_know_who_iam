package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.prefUtils.preferences.SocialMediaPrefs;
import kotlin.jvm.internal.o;
/* compiled from: SocialMediaRepository.kt */
/* loaded from: classes2.dex */
public final class SocialMediaRepository {
    public static final int $stable = 8;
    private final jj.b preference;

    public SocialMediaRepository(jj.b preference) {
        o.i(preference, "preference");
        this.preference = preference;
    }

    public final Object getSocialMediaLink(SocialMediaPrefs.SocialMediaTypes socialMediaTypes, zz.a<? super String> aVar) {
        return this.preference.j().a(socialMediaTypes, aVar);
    }
}
