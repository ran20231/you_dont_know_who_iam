package com.forsale.app.features.postad.addons.promoteaddonhelp;

import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import kotlin.jvm.internal.o;
/* compiled from: PromoteAddonHelpViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final String f34795l0;

    /* renamed from: m0  reason: collision with root package name */
    private final String f34796m0;

    /* renamed from: n0  reason: collision with root package name */
    private final String f34797n0;

    /* renamed from: o0  reason: collision with root package name */
    private final String f34798o0;

    /* compiled from: PromoteAddonHelpViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        d a(String str, String str2, String str3, String str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String addonHelpUrl, String str, String str2, String str3, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(addonHelpUrl, "addonHelpUrl");
        o.i(baseRepository, "baseRepository");
        this.f34795l0 = addonHelpUrl;
        this.f34796m0 = str;
        this.f34797n0 = str2;
        this.f34798o0 = str3;
    }

    public final String w0() {
        return this.f34795l0;
    }

    public final String x0() {
        return this.f34798o0;
    }

    public final String y0() {
        return this.f34797n0;
    }

    public final String z0() {
        return this.f34796m0;
    }
}
