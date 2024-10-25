package com.forsale.app.features.maincontainer;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.google.android.gms.ads.AdRequest;
import g00.p;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okhttp3.internal.http2.Http2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToListingDetails$1", f = "MainContainerActivity.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$navigateToListingDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31406b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31407c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f31408d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsOwnerActions f31409e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToListingDetails$1(MainContainerActivity mainContainerActivity, int i11, String str, ListingDetailsOwnerActions listingDetailsOwnerActions, zz.a<? super MainContainerActivity$navigateToListingDetails$1> aVar) {
        super(2, aVar);
        this.f31406b = mainContainerActivity;
        this.f31407c = i11;
        this.f31408d = str;
        this.f31409e = listingDetailsOwnerActions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToListingDetails$1(this.f31406b, this.f31407c, this.f31408d, this.f31409e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31405a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            z12 = this.f31406b.z1();
            if (z12) {
                MainContainerActivity mainContainerActivity = this.f31406b;
                HomeTabs homeTabs = mainContainerActivity.x0().f1().get();
                o.h(homeTabs, "get(...)");
                mainContainerActivity.i2(homeTabs);
            }
            this.f31405a = 1;
            if (DelayKt.delay(100L, this) == f11) {
                return f11;
            }
        }
        ListingDetailsActivity.R.a(this.f31406b, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : this.f31407c, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : this.f31408d, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : this.f31409e, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToListingDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
