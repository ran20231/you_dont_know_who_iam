package com.forsale.app.features.categories.listingdetails;

import android.content.Intent;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$loadIntentForModifiedListing$1", f = "ListingDetailsActivity.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsActivity$loadIntentForModifiedListing$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25119a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f25120b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsActivity$loadIntentForModifiedListing$1(ListingDetailsActivity listingDetailsActivity, zz.a<? super ListingDetailsActivity$loadIntentForModifiedListing$1> aVar) {
        super(2, aVar);
        this.f25120b = listingDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsActivity$loadIntentForModifiedListing$1(this.f25120b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25119a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingDetailsViewModel x02 = this.f25120b.x0();
            this.f25119a = 1;
            obj = x02.c1(this);
            if (obj == f11) {
                return f11;
            }
        }
        AnalyticsListingsSource analyticsListingsSource = (AnalyticsListingsSource) obj;
        if (analyticsListingsSource != null) {
            ListingDetailsActivity listingDetailsActivity = this.f25120b;
            Intent intent = new Intent();
            intent.putExtra("LISTING_SOURCE", analyticsListingsSource);
            listingDetailsActivity.setResult(-1, intent);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsActivity$loadIntentForModifiedListing$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
