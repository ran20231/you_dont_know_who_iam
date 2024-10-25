package com.forsale.app.features.categories.listingdetails;

import android.content.Intent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import zf.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$launchPLFToEdit$1", f = "ListingDetailsActivity.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsActivity$launchPLFToEdit$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25111a;

    /* renamed from: b  reason: collision with root package name */
    int f25112b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f25113c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a.C0991a f25114d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsActivity$launchPLFToEdit$1(ListingDetailsActivity listingDetailsActivity, a.C0991a c0991a, zz.a<? super ListingDetailsActivity$launchPLFToEdit$1> aVar) {
        super(2, aVar);
        this.f25113c = listingDetailsActivity;
        this.f25114d = c0991a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsActivity$launchPLFToEdit$1(this.f25113c, this.f25114d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        androidx.activity.result.b<Intent> bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25112b;
        if (i11 != 0) {
            if (i11 == 1) {
                bVar = (androidx.activity.result.b) this.f25111a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            androidx.activity.result.b<Intent> q12 = this.f25113c.q1();
            this.f25111a = q12;
            this.f25112b = 1;
            Object a11 = this.f25113c.r1().get().a(this);
            if (a11 == f11) {
                return f11;
            }
            bVar = q12;
            obj = a11;
        }
        bVar.a(((zf.b) obj).b(this.f25113c, this.f25114d));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsActivity$launchPLFToEdit$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
