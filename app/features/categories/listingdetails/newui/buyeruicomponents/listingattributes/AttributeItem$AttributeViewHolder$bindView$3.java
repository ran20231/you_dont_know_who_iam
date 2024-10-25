package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import aa.qh;
import android.content.Context;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem;
import com.forsale.app.utils.OneShotEventHandler;
import dj.e;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$bindView$3", f = "AttributeItem.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeItem$AttributeViewHolder$bindView$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27437a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeItem f27438b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeItem.AttributeViewHolder f27439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AttributeItem.AttributeViewHolder f27440a;

        a(AttributeItem.AttributeViewHolder attributeViewHolder) {
            this.f27440a = attributeViewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            e i11;
            qh qhVar;
            if (str != null) {
                i11 = this.f27440a.i();
                qhVar = this.f27440a.f27431a;
                Context context = qhVar.getRoot().getContext();
                o.h(context, "getContext(...)");
                i11.a(context, str, "Q84SALE_IMAGES");
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeItem$AttributeViewHolder$bindView$3(AttributeItem attributeItem, AttributeItem.AttributeViewHolder attributeViewHolder, zz.a<? super AttributeItem$AttributeViewHolder$bindView$3> aVar) {
        super(2, aVar);
        this.f27438b = attributeItem;
        this.f27439c = attributeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeItem$AttributeViewHolder$bindView$3(this.f27438b, this.f27439c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27437a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<String> g11 = this.f27438b.f27427f.g();
            a aVar = new a(this.f27439c);
            this.f27437a = 1;
            if (g11.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeItem$AttributeViewHolder$bindView$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
