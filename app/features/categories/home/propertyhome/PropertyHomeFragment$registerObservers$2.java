package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$2", f = "PropertyHomeFragment.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PropertyHomeFragment$registerObservers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeFragment f24774c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PropertyHomeFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$2$1", f = "PropertyHomeFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CategoryEntity, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24775a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PropertyHomeFragment f24777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PropertyHomeFragment propertyHomeFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24777c = propertyHomeFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(CategoryEntity categoryEntity, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(categoryEntity, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24777c, aVar);
            anonymousClass1.f24776b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f24775a == 0) {
                kotlin.f.b(obj);
                CategoryEntity categoryEntity = (CategoryEntity) this.f24776b;
                if (categoryEntity != null) {
                    this.f24777c.d0(categoryEntity);
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeFragment$registerObservers$2(PropertyHomeViewModel propertyHomeViewModel, PropertyHomeFragment propertyHomeFragment, zz.a<? super PropertyHomeFragment$registerObservers$2> aVar) {
        super(2, aVar);
        this.f24773b = propertyHomeViewModel;
        this.f24774c = propertyHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeFragment$registerObservers$2(this.f24773b, this.f24774c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24772a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<CategoryEntity> A = this.f24773b.A();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24774c, null);
            this.f24772a = 1;
            if (FlowKt.collectLatest(A, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeFragment$registerObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
