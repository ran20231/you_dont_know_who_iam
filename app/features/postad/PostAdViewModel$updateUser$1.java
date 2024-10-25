package com.forsale.app.features.postad;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateUser$1", f = "PostAdViewModel.kt", l = {1550}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$updateUser$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34194a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34195b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$updateUser$1$1", f = "PostAdViewModel.kt", l = {1551}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdViewModel$updateUser$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<UserEntity, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34196a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdViewModel f34198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdViewModel postAdViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34198c = postAdViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(UserEntity userEntity, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(userEntity, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34198c, aVar);
            anonymousClass1.f34197b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableStateFlow mutableStateFlow;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34196a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                mutableStateFlow = this.f34198c.f33951n2;
                this.f34196a = 1;
                if (mutableStateFlow.emit((UserEntity) this.f34197b, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$updateUser$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$updateUser$1> aVar) {
        super(2, aVar);
        this.f34195b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$updateUser$1(this.f34195b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Flow flow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34194a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            flow = this.f34195b.f33945l2;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34195b, null);
            this.f34194a = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$updateUser$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
