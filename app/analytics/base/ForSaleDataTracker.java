package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.d;
import com.forsale.app.analytics.base.e;
import com.forsale.app.analytics.base.kits.AmplitudeKit;
import com.forsale.app.analytics.base.kits.FirebaseKit;
import com.forsale.app.analytics.base.kits.LeanPlumKit;
import com.forsale.app.analytics.base.kits.MoEngageKit;
import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.o;
/* compiled from: ForSaleDataTracker.kt */
/* loaded from: classes2.dex */
public final class ForSaleDataTracker {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseKit f21969a;

    /* renamed from: b  reason: collision with root package name */
    private final AmplitudeKit f21970b;

    /* renamed from: c  reason: collision with root package name */
    private final LeanPlumKit f21971c;

    /* renamed from: d  reason: collision with root package name */
    private final MoEngageKit f21972d;

    public ForSaleDataTracker(FirebaseKit firebaseKit, AmplitudeKit amplitudeKit, LeanPlumKit leanPlumKit, MoEngageKit moEngageKit) {
        o.i(firebaseKit, "firebaseKit");
        o.i(amplitudeKit, "amplitudeKit");
        o.i(leanPlumKit, "leanPlumKit");
        o.i(moEngageKit, "moEngageKit");
        this.f21969a = firebaseKit;
        this.f21970b = amplitudeKit;
        this.f21971c = leanPlumKit;
        this.f21972d = moEngageKit;
    }

    private final void b(u9.a aVar) {
        this.f21969a.i(aVar);
        this.f21970b.h(aVar);
        this.f21971c.h(aVar);
        this.f21972d.i(aVar);
    }

    private final void d(d.c cVar) {
        this.f21969a.j(cVar);
        this.f21970b.i(cVar);
        this.f21971c.i(cVar);
        this.f21972d.j(cVar);
    }

    private final void e(Languages languages) {
        this.f21969a.k(languages);
        this.f21970b.j(languages);
        this.f21971c.j(languages);
        this.f21972d.k(languages);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(u9.c r12, zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.analytics.base.ForSaleDataTracker.a(u9.c, zz.a):java.lang.Object");
    }

    public final void c(e configType) {
        o.i(configType, "configType");
        if (configType instanceof e.a) {
            b(((e.a) configType).a());
        } else if (configType instanceof e.b) {
            e(((e.b) configType).a());
        } else if (configType instanceof e.c) {
            d(((e.c) configType).a());
        }
    }
}
