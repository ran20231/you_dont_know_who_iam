package com.forsale.app.ui.bottomsheets.attributes;

import com.google.android.gms.maps.model.PinConfig;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* compiled from: AttributeOptionsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$1", f = "AttributeOptionsBottomSheet.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AttributeOptionsBottomSheet$onCreateView$1$1$1$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeOptionsBottomSheet f38016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeOptionsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$1$1", f = "AttributeOptionsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AttributeOptionsBottomSheet f38018b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeOptionsBottomSheet attributeOptionsBottomSheet, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38018b = attributeOptionsBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f38018b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f38017a == 0) {
                f.b(obj);
                this.f38018b.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeOptionsBottomSheet$onCreateView$1$1$1$1(AttributeOptionsBottomSheet attributeOptionsBottomSheet, a<? super AttributeOptionsBottomSheet$onCreateView$1$1$1$1> aVar) {
        super(1, aVar);
        this.f38016b = attributeOptionsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new AttributeOptionsBottomSheet$onCreateView$1$1$1$1(this.f38016b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38015a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> d11 = this.f38016b.r().d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38016b, null);
            this.f38015a = 1;
            if (FlowKt.collectLatest(d11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((AttributeOptionsBottomSheet$onCreateView$1$1$1$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
