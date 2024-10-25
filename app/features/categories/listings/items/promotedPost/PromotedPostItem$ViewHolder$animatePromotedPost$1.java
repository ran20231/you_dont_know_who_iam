package com.forsale.app.features.categories.listings.items.promotedPost;

import android.animation.ValueAnimator;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItem.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$animatePromotedPost$1", f = "PromotedPostItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItem$ViewHolder$animatePromotedPost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30860a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PromotedPostItem.ViewHolder f30861b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItem$ViewHolder$animatePromotedPost$1(PromotedPostItem.ViewHolder viewHolder, zz.a<? super PromotedPostItem$ViewHolder$animatePromotedPost$1> aVar) {
        super(2, aVar);
        this.f30861b = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItem$ViewHolder$animatePromotedPost$1(this.f30861b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i3.d u11;
        i3.d dVar;
        ValueAnimator w11;
        b.f();
        if (this.f30860a == 0) {
            f.b(obj);
            this.f30861b.t();
            PromotedPostItem.ViewHolder viewHolder = this.f30861b;
            u11 = viewHolder.u();
            viewHolder.f30855c = u11;
            dVar = this.f30861b.f30855c;
            if (dVar == null) {
                o.w("springAnimation");
                dVar = null;
            }
            dVar.m();
            w11 = this.f30861b.w();
            w11.start();
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItem$ViewHolder$animatePromotedPost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
