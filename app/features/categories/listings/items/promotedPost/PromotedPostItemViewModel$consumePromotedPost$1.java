package com.forsale.app.features.categories.listings.items.promotedPost;

import com.forsale.app.base.viewmodels.BaseViewModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PromotedPostItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel$consumePromotedPost$1", f = "PromotedPostItemViewModel.kt", l = {199, 202}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PromotedPostItemViewModel$consumePromotedPost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30888a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<Integer> f30889b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f30890c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<Integer> f30891d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItemViewModel$consumePromotedPost$1(List<Integer> list, PromotedPostItemViewModel promotedPostItemViewModel, List<Integer> list2, zz.a<? super PromotedPostItemViewModel$consumePromotedPost$1> aVar) {
        super(2, aVar);
        this.f30889b = list;
        this.f30890c = promotedPostItemViewModel;
        this.f30891d = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PromotedPostItemViewModel$consumePromotedPost$1(this.f30889b, this.f30890c, this.f30891d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BaseViewModel baseViewModel;
        BaseViewModel baseViewModel2;
        f11 = b.f();
        int i11 = this.f30888a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f30889b == null) {
                x10.a.b("PROMOTED: consumePromotedPostAsync", new Object[0]);
                baseViewModel2 = this.f30890c.f30868d;
                List<Integer> list = this.f30891d;
                this.f30888a = 1;
                if (baseViewModel2.o(list, this) == f11) {
                    return f11;
                }
            } else {
                x10.a.b("PROMOTED: consumePromotedPost", new Object[0]);
                baseViewModel = this.f30890c.f30868d;
                List<Integer> list2 = this.f30891d;
                List<Integer> list3 = this.f30889b;
                this.f30888a = 2;
                if (baseViewModel.m(list2, list3, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PromotedPostItemViewModel$consumePromotedPost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
