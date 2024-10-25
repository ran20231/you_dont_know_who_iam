package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import aa.qh;
import android.content.Context;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
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
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributeItem$AttributeViewHolder$bindView$2", f = "AttributeItem.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeItem$AttributeViewHolder$bindView$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27433a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeItem f27434b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeItem.AttributeViewHolder f27435c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AttributeItem.AttributeViewHolder f27436a;

        a(AttributeItem.AttributeViewHolder attributeViewHolder) {
            this.f27436a = attributeViewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            qh qhVar;
            if (str != null) {
                WebActivity.a aVar2 = WebActivity.I;
                qhVar = this.f27436a.f27431a;
                Context context = qhVar.getRoot().getContext();
                o.h(context, "getContext(...)");
                WebActivity.a.d(aVar2, context, WebType.PDF, TypeExtensionsKt.V0(str), str, 0, null, 16, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeItem$AttributeViewHolder$bindView$2(AttributeItem attributeItem, AttributeItem.AttributeViewHolder attributeViewHolder, zz.a<? super AttributeItem$AttributeViewHolder$bindView$2> aVar) {
        super(2, aVar);
        this.f27434b = attributeItem;
        this.f27435c = attributeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeItem$AttributeViewHolder$bindView$2(this.f27434b, this.f27435c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27433a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<String> f12 = this.f27434b.f27427f.f();
            a aVar = new a(this.f27435c);
            this.f27433a = 1;
            if (f12.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeItem$AttributeViewHolder$bindView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
