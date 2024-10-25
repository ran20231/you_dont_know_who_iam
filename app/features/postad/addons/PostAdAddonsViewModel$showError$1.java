package com.forsale.app.features.postad.addons;

import androidx.lifecycle.r0;
import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showError$1", f = "PostAdAddonsViewModel.kt", l = {ErrorCodes.BLOCKED_USER_ERROR_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$showError$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34381a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34382b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f34383c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$showError$1(PostAdAddonsViewModel postAdAddonsViewModel, String str, zz.a<? super PostAdAddonsViewModel$showError$1> aVar) {
        super(2, aVar);
        this.f34382b = postAdAddonsViewModel;
        this.f34383c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsViewModel$showError$1(this.f34382b, this.f34383c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34381a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<com.forsale.app.utils.b> V = this.f34382b.V();
            String str = this.f34383c;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.Z4);
            final PostAdAddonsViewModel postAdAddonsViewModel = this.f34382b;
            com.forsale.app.utils.b bVar = new com.forsale.app.utils.b("", str, d11, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showError$1.1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: PostAdAddonsViewModel.kt */
                @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showError$1$1$1", f = "PostAdAddonsViewModel.kt", l = {410}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showError$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C03821 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f34385a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ PostAdAddonsViewModel f34386b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C03821(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super C03821> aVar) {
                        super(2, aVar);
                        this.f34386b = postAdAddonsViewModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                        return new C03821(this.f34386b, aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        MutableSharedFlow mutableSharedFlow;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f34385a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            f.b(obj);
                            mutableSharedFlow = this.f34386b.A0;
                            wz.p pVar = wz.p.f75480a;
                            this.f34385a = 1;
                            if (mutableSharedFlow.emit(pVar, this) == f11) {
                                return f11;
                            }
                        }
                        return wz.p.f75480a;
                    }

                    @Override // g00.p
                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                        return ((C03821) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                    }
                }

                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(PostAdAddonsViewModel.this), null, null, new C03821(PostAdAddonsViewModel.this, null), 3, null);
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showError$1.2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }
            });
            this.f34381a = 1;
            if (V.emit(bVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$showError$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
