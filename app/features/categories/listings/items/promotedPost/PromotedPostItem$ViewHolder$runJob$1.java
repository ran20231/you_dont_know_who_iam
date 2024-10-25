package com.forsale.app.features.categories.listings.items.promotedPost;

import aa.ch;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItem.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$runJob$1", f = "PromotedPostItem.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItem$ViewHolder$runJob$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f30864a;

    /* renamed from: b  reason: collision with root package name */
    int f30865b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PromotedPostItem.ViewHolder f30866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItem$ViewHolder$runJob$1(PromotedPostItem.ViewHolder viewHolder, zz.a<? super PromotedPostItem$ViewHolder$runJob$1> aVar) {
        super(2, aVar);
        this.f30866c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItem$ViewHolder$runJob$1(this.f30866c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ch chVar;
        PromotedPostItemViewModel promotedPostItemViewModel;
        f11 = b.f();
        int i11 = this.f30865b;
        if (i11 != 0) {
            if (i11 == 1) {
                promotedPostItemViewModel = (PromotedPostItemViewModel) this.f30864a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            chVar = this.f30866c.f30853a;
            PromotedPostItemViewModel h02 = chVar.h0();
            if (h02 != null) {
                long longValue = h02.H().getValue().longValue();
                this.f30864a = h02;
                this.f30865b = 1;
                if (DelayKt.delay(longValue, this) == f11) {
                    return f11;
                }
                promotedPostItemViewModel = h02;
            }
            return wz.p.f75480a;
        }
        x10.a.b("PROMOTED: afterAnimation delay", new Object[0]);
        o.f(promotedPostItemViewModel);
        PromotedPostItemViewModel.B(promotedPostItemViewModel, null, 1, null);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItem$ViewHolder$runJob$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
