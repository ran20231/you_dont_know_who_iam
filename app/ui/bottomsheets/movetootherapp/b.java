package com.forsale.app.ui.bottomsheets.movetootherapp;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import t9.y0;
import wz.p;
/* compiled from: MoveToOtherAppViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final String f38961k0;

    /* renamed from: l0  reason: collision with root package name */
    private final String f38962l0;

    /* renamed from: m0  reason: collision with root package name */
    private final String f38963m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ApplicationResourcesRepository f38964n0;

    /* renamed from: o0  reason: collision with root package name */
    private final String f38965o0;

    /* renamed from: p0  reason: collision with root package name */
    private final b0<String> f38966p0;

    /* renamed from: q0  reason: collision with root package name */
    private final b0<String> f38967q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38968r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<Pair<String, String>> f38969s0;

    /* compiled from: MoveToOtherAppViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(String str, String str2, String str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String appToGo, String advId, String str, ApplicationResourcesRepository appRepo, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(appToGo, "appToGo");
        o.i(advId, "advId");
        o.i(appRepo, "appRepo");
        o.i(baseRepository, "baseRepository");
        this.f38961k0 = appToGo;
        this.f38962l0 = advId;
        this.f38963m0 = str;
        this.f38964n0 = appRepo;
        String z02 = z0();
        this.f38965o0 = z02;
        this.f38966p0 = new b0<>(appRepo.getString(y0.J5, z02, z02));
        this.f38967q0 = new b0<>(z02);
        this.f38968r0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38969s0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
        r11 = kotlin.text.s.C(r12, " ", "-", false, 4, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String y0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            kotlin.jvm.internal.w r0 = kotlin.jvm.internal.w.f61809a
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r0 = r10.f38964n0
            int r1 = t9.y0.Ga
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getString(r1, r3)
            r1 = 3
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.forsale.app.utils.LocaleManager r4 = com.forsale.app.utils.LocaleManager.f39597a
            com.forsale.app.utils.Languages r4 = r4.g()
            java.lang.String r4 = r4.getValue()
            r3[r2] = r4
            r2 = 1
            r3[r2] = r11
            if (r12 == 0) goto L2f
            java.lang.String r5 = " "
            java.lang.String r6 = "-"
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r12
            java.lang.String r11 = kotlin.text.k.C(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L31
        L2f:
            java.lang.String r11 = ""
        L31:
            r12 = 2
            r3[r12] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r11 = java.lang.String.format(r0, r11)
            java.lang.String r12 = "format(...)"
            kotlin.jvm.internal.o.h(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.movetootherapp.b.y0(java.lang.String, java.lang.String):java.lang.String");
    }

    private final String z0() {
        String str = this.f38961k0;
        if (o.d(str, ListingSourceApp.FORSALE.getValue())) {
            return this.f38964n0.getString(y0.f70411d0, new Object[0]);
        }
        if (o.d(str, ListingSourceApp.Q8CAR.getValue())) {
            return this.f38964n0.getString(y0.f70428e0, new Object[0]);
        }
        return "";
    }

    public final b0<String> A0() {
        return this.f38967q0;
    }

    public final void B0() {
        OneShotEventHandler.d(this.f38968r0, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f38962l0
            if (r0 == 0) goto Ld
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.String r0 = r8.f38961k0
            com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp r1 = com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp.FORSALE
            java.lang.String r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.o.d(r0, r1)
            if (r1 == 0) goto L2d
            java.lang.String r2 = "com.forsale.forsale"
            java.lang.String r3 = "com.q8car.andriod.activity"
            java.lang.String r4 = "com.forsale.forsale"
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r0 = kotlin.text.k.C(r2, r3, r4, r5, r6, r7)
            goto L48
        L2d:
            com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp r1 = com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp.Q8CAR
            java.lang.String r1 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.o.d(r0, r1)
            if (r0 == 0) goto L47
            java.lang.String r1 = "com.forsale.forsale"
            java.lang.String r2 = "com.forsale.forsale"
            java.lang.String r3 = "com.q8car.andriod.activity"
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r0 = kotlin.text.k.C(r1, r2, r3, r4, r5, r6)
            goto L48
        L47:
            r0 = 0
        L48:
            if (r0 == 0) goto L5c
            com.forsale.app.utils.OneShotEventHandler<kotlin.Pair<java.lang.String, java.lang.String>> r1 = r8.f38969s0
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = r8.f38962l0
            java.lang.String r4 = r8.f38963m0
            java.lang.String r3 = r8.y0(r3, r4)
            r2.<init>(r0, r3)
            r1.i(r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.movetootherapp.b.C0():void");
    }

    public final b0<String> v0() {
        return this.f38966p0;
    }

    public final OneShotEventHandler<p> w0() {
        return this.f38968r0;
    }

    public final OneShotEventHandler<Pair<String, String>> x0() {
        return this.f38969s0;
    }
}
