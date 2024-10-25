package com.forsale.app.features.categories.normal;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: SubCategoriesFragment.kt */
@d(c = "com.forsale.app.features.categories.normal.SubCategoriesFragment$bindObservers$1", f = "SubCategoriesFragment.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SubCategoriesFragment$bindObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SubCategoriesFragment f31020b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubCategoriesFragment.kt */
    @d(c = "com.forsale.app.features.categories.normal.SubCategoriesFragment$bindObservers$1$1", f = "SubCategoriesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.normal.SubCategoriesFragment$bindObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<InAppMessageEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31021a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f31022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SubCategoriesFragment f31023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubCategoriesFragment subCategoriesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31023c = subCategoriesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(inAppMessageEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31023c, aVar);
            anonymousClass1.f31022b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31021a == 0) {
                f.b(obj);
                InAppMessageEntity inAppMessageEntity = (InAppMessageEntity) this.f31022b;
                if (inAppMessageEntity != null) {
                    String text = inAppMessageEntity.getText();
                    x10.a.b("PROMOTED: viewModel.inAppMessageEvent.observe " + text, new Object[0]);
                    this.f31023c.B().Z0().W(inAppMessageEntity);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesFragment$bindObservers$1(SubCategoriesFragment subCategoriesFragment, zz.a<? super SubCategoriesFragment$bindObservers$1> aVar) {
        super(1, aVar);
        this.f31020b = subCategoriesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SubCategoriesFragment$bindObservers$1(this.f31020b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31019a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<InAppMessageEntity> z11 = this.f31020b.B().z();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31020b, null);
            this.f31019a = 1;
            if (FlowKt.collectLatest(z11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SubCategoriesFragment$bindObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
