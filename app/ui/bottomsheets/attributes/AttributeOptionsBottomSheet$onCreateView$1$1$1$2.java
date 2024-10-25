package com.forsale.app.ui.bottomsheets.attributes;

import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
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
@d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$2", f = "AttributeOptionsBottomSheet.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AttributeOptionsBottomSheet$onCreateView$1$1$1$2 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeOptionsBottomSheet f38020b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeOptionsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$2$1", f = "AttributeOptionsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsBottomSheet$onCreateView$1$1$1$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ExtraAttributeOptionEntity, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38021a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AttributeOptionsBottomSheet f38023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AttributeOptionsBottomSheet attributeOptionsBottomSheet, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38023c = attributeOptionsBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ExtraAttributeOptionEntity extraAttributeOptionEntity, a<? super p> aVar) {
            return ((AnonymousClass1) create(extraAttributeOptionEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38023c, aVar);
            anonymousClass1.f38022b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f38021a == 0) {
                f.b(obj);
                ExtraAttributeOptionEntity extraAttributeOptionEntity = (ExtraAttributeOptionEntity) this.f38022b;
                if (extraAttributeOptionEntity != null) {
                    this.f38023c.q().a(extraAttributeOptionEntity);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeOptionsBottomSheet$onCreateView$1$1$1$2(AttributeOptionsBottomSheet attributeOptionsBottomSheet, a<? super AttributeOptionsBottomSheet$onCreateView$1$1$1$2> aVar) {
        super(1, aVar);
        this.f38020b = attributeOptionsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new AttributeOptionsBottomSheet$onCreateView$1$1$1$2(this.f38020b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38019a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ExtraAttributeOptionEntity> e11 = this.f38020b.r().e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38020b, null);
            this.f38019a = 1;
            if (FlowKt.collectLatest(e11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((AttributeOptionsBottomSheet$onCreateView$1$1$1$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
