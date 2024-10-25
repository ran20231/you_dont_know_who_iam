package com.forsale.app.ui.bottomsheets.listingdetailschat;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import wz.p;
/* compiled from: ChatNowViewModel.kt */
/* loaded from: classes3.dex */
public final class ChatNowViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final b f38144k0;

    /* renamed from: l0  reason: collision with root package name */
    private final jj.b f38145l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<String> f38146m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<String> f38147n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38148o0;

    /* compiled from: ChatNowViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        ChatNowViewModel a(b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNowViewModel(b chatNowModel, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(chatNowModel, "chatNowModel");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f38144k0 = chatNowModel;
        this.f38145l0 = prefs;
        this.f38146m0 = new b0<>();
        this.f38147n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38148o0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final void A0(AggregatedAllAnalyticsLogger.AdvActionEvents action, boolean z11, boolean z12) {
        o.i(action, "action");
        ListingItemDetails f11 = this.f38144k0.f();
        if (f11 != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new ChatNowViewModel$logAnalytics$1$1(this, action, f11, z11, z12, null), 3, null);
        }
    }

    public final void B0() {
        OneShotEventHandler.d(this.f38148o0, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0() {
        /*
            r2 = this;
            com.forsale.app.ui.bottomsheets.listingdetailschat.b r0 = r2.f38144k0
            boolean r0 = r0.l()
            if (r0 != 0) goto L28
            androidx.lifecycle.b0<java.lang.String> r0 = r2.f38146m0
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1c
            boolean r1 = kotlin.text.k.v(r1)
            if (r1 == 0) goto L1a
            goto L1c
        L1a:
            r1 = 0
            goto L1d
        L1c:
            r1 = 1
        L1d:
            if (r1 != 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.String r0 = (java.lang.String) r0
            com.forsale.app.utils.OneShotEventHandler<java.lang.String> r1 = r2.f38147n0
            r1.i(r0)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowViewModel.C0():void");
    }

    public final void D0() {
        A0(AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CHAT_STARTED, true, true);
    }

    public final b w0() {
        return this.f38144k0;
    }

    public final OneShotEventHandler<p> x0() {
        return this.f38148o0;
    }

    public final b0<String> y0() {
        return this.f38146m0;
    }

    public final OneShotEventHandler<String> z0() {
        return this.f38147n0;
    }
}
