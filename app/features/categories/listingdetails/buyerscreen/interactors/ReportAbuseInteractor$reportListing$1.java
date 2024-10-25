package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReportAbuseInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ReportAbuseInteractor", f = "ReportAbuseInteractor.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "reportListing")
/* loaded from: classes2.dex */
public final class ReportAbuseInteractor$reportListing$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f26015a;

    /* renamed from: b  reason: collision with root package name */
    Object f26016b;

    /* renamed from: c  reason: collision with root package name */
    int f26017c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f26018d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ReportAbuseInteractor f26019e;

    /* renamed from: f  reason: collision with root package name */
    int f26020f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseInteractor$reportListing$1(ReportAbuseInteractor reportAbuseInteractor, zz.a<? super ReportAbuseInteractor$reportListing$1> aVar) {
        super(aVar);
        this.f26019e = reportAbuseInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26018d = obj;
        this.f26020f |= Integer.MIN_VALUE;
        return this.f26019e.b(0, null, null, this);
    }
}
