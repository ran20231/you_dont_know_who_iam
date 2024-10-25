package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingChatViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel$onItemClick$1", f = "ListingChatViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingChatViewModel$onItemClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingChatViewModel f27369b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingChatViewModel$onItemClick$1(ListingChatViewModel listingChatViewModel, zz.a<? super ListingChatViewModel$onItemClick$1> aVar) {
        super(2, aVar);
        this.f27369b = listingChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingChatViewModel$onItemClick$1(this.f27369b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27368a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<ListingItemBrief> y02 = this.f27369b.y0();
            ListingItemBrief x02 = this.f27369b.x0();
            this.f27368a = 1;
            if (y02.f(x02, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingChatViewModel$onItemClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
