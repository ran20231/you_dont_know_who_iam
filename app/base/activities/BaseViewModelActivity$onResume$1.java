package com.forsale.app.base.activities;

import android.graphics.Bitmap;
import android.view.View;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onResume$1", f = "BaseViewModelActivity.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onResume$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22122a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22123b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onResume$1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onResume$1> aVar) {
        super(2, aVar);
        this.f22123b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModelActivity$onResume$1(this.f22123b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22122a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<InAppMessageEntity> z11 = this.f22123b.x0().z();
            final BaseViewModelActivity<B, VM> baseViewModelActivity = this.f22123b;
            FlowCollector<InAppMessageEntity> flowCollector = new FlowCollector<InAppMessageEntity>() { // from class: com.forsale.app.base.activities.BaseViewModelActivity$onResume$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(final InAppMessageEntity inAppMessageEntity, a<? super wz.p> aVar) {
                    int v02;
                    int v03;
                    if (inAppMessageEntity != null) {
                        x10.a.b("consume IN APP VIEW", new Object[0]);
                        baseViewModelActivity.x0().l0(inAppMessageEntity);
                        Bitmap imageBitmap = inAppMessageEntity.getImageBitmap();
                        if (imageBitmap != null) {
                            final BaseViewModelActivity<B, VM> baseViewModelActivity2 = baseViewModelActivity;
                            View root = baseViewModelActivity2.o0().getRoot();
                            o.h(root, "getRoot(...)");
                            v03 = baseViewModelActivity2.v0();
                            TopLevelUtilityFunctionsKt.g(root, inAppMessageEntity.getDuration() * 1000, imageBitmap, v03, new g00.a<wz.p>() { // from class: com.forsale.app.base.activities.BaseViewModelActivity$onResume$1$1$emit$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    baseViewModelActivity2.y0(inAppMessageEntity);
                                }
                            });
                        } else {
                            String text = inAppMessageEntity.getText();
                            if (text != null) {
                                final BaseViewModelActivity<B, VM> baseViewModelActivity3 = baseViewModelActivity;
                                x10.a.b("consume IN APP VIEW TEXT", new Object[0]);
                                View root2 = baseViewModelActivity3.o0().getRoot();
                                o.h(root2, "getRoot(...)");
                                v02 = baseViewModelActivity3.v0();
                                TopLevelUtilityFunctionsKt.i(root2, inAppMessageEntity.getDuration() * 1000, text, v02, new g00.a<wz.p>() { // from class: com.forsale.app.base.activities.BaseViewModelActivity$onResume$1$1$emit$3$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        baseViewModelActivity3.y0(inAppMessageEntity);
                                    }
                                });
                            }
                        }
                    }
                    return wz.p.f75480a;
                }
            };
            this.f22122a = 1;
            if (z11.collect(flowCollector, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModelActivity$onResume$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
