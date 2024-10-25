package com.forsale.app.features.postad.addons.calculatorNew;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalculatorDialogueViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.CalculatorDialogueViewModel$saveAutoRepost$1", f = "CalculatorDialogueViewModel.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CalculatorDialogueViewModel$saveAutoRepost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34572a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CalculatorDialogueViewModel f34573b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f34574c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculatorDialogueViewModel$saveAutoRepost$1(CalculatorDialogueViewModel calculatorDialogueViewModel, boolean z11, zz.a<? super CalculatorDialogueViewModel$saveAutoRepost$1> aVar) {
        super(2, aVar);
        this.f34573b = calculatorDialogueViewModel;
        this.f34574c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CalculatorDialogueViewModel$saveAutoRepost$1(this.f34573b, this.f34574c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        PostAdViewModel postAdViewModel;
        PostAdViewModel postAdViewModel2;
        ListingDetailsEntity copy;
        f11 = b.f();
        int i11 = this.f34572a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f34573b.f34556q0;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f34574c);
            this.f34572a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        postAdViewModel = this.f34573b.f34553n0;
        ListingDetailsEntity n22 = postAdViewModel.n2();
        if (n22 != null) {
            CalculatorDialogueViewModel calculatorDialogueViewModel = this.f34573b;
            boolean z11 = this.f34574c;
            postAdViewModel2 = calculatorDialogueViewModel.f34553n0;
            copy = n22.copy((r63 & 1) != 0 ? n22.f22332id : 0, (r63 & 2) != 0 ? n22.slug : null, (r63 & 4) != 0 ? n22.deviceId : null, (r63 & 8) != 0 ? n22.regionId : 0, (r63 & 16) != 0 ? n22.categoryId : null, (r63 & 32) != 0 ? n22.districtsIds : null, (r63 & 64) != 0 ? n22.title : null, (r63 & 128) != 0 ? n22.description : null, (r63 & 256) != 0 ? n22.contactNo : null, (r63 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? n22.language : null, (r63 & 1024) != 0 ? n22.price : null, (r63 & RecyclerView.l.FLAG_MOVED) != 0 ? n22.addonsRequested : null, (r63 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? n22.extraAttrs : null, (r63 & 8192) != 0 ? n22.pmEnabled : null, (r63 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? n22.voipEnabled : null, (r63 & 32768) != 0 ? n22.draft : null, (r63 & 65536) != 0 ? n22.status : null, (r63 & 131072) != 0 ? n22.hideMyNumber : null, (r63 & 262144) != 0 ? n22.anonymous : null, (r63 & 524288) != 0 ? n22.attemptAbuse : null, (r63 & 1048576) != 0 ? n22.geotagLon : null, (r63 & 2097152) != 0 ? n22.geotagLat : null, (r63 & 4194304) != 0 ? n22.repostAutoRenew : kotlin.coroutines.jvm.internal.a.d(TypeExtensionsKt.H0(z11)), (r63 & 8388608) != 0 ? n22.doNotDisturb : null, (r63 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? n22.images : null, (r63 & 33554432) != 0 ? n22.imageUrls : null, (r63 & 67108864) != 0 ? n22.videoFileName : null, (r63 & 134217728) != 0 ? n22.videoUrl : null, (r63 & 268435456) != 0 ? n22.videoThumb : null, (r63 & 536870912) != 0 ? n22.deleteVideo : null, (r63 & 1073741824) != 0 ? n22.planId : null, (r63 & Integer.MIN_VALUE) != 0 ? n22.prohibtedKeyWords : null, (r64 & 1) != 0 ? n22.phone : null, (r64 & 2) != 0 ? n22.extraInfo : null, (r64 & 4) != 0 ? n22.sourceItemId : null, (r64 & 8) != 0 ? n22.hasAddons : null, (r64 & 16) != 0 ? n22.allowEditOnDistrict : null, (r64 & 32) != 0 ? n22.cachedAdv : null, (r64 & 64) != 0 ? n22.approvedAddons : null, (r64 & 128) != 0 ? n22.planPrice : null, (r64 & 256) != 0 ? n22.planIsFree : null, (r64 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? n22.planExtendPeriod : null, (r64 & 1024) != 0 ? n22.hasBundle : null, (r64 & RecyclerView.l.FLAG_MOVED) != 0 ? n22.expireSoon : null, (r64 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? n22.leftOverFlag : 0);
            postAdViewModel2.L4(copy);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CalculatorDialogueViewModel$saveAutoRepost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
