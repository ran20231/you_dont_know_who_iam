package com.forsale.app.features.postad;

import androidx.lifecycle.b0;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$findNavigationTarget$1", f = "PostAdViewModel.kt", l = {511, 516, 521, 526, 531, 536, 541, 546, 552, 558}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$findNavigationTarget$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34033a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34034b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdScreens f34035c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$findNavigationTarget$1(PostAdViewModel postAdViewModel, PostAdScreens postAdScreens, zz.a<? super PostAdViewModel$findNavigationTarget$1> aVar) {
        super(2, aVar);
        this.f34034b = postAdViewModel;
        this.f34035c = postAdScreens;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$findNavigationTarget$1(this.f34034b, this.f34035c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        b0 b0Var2;
        MutableSharedFlow mutableSharedFlow3;
        b0 b0Var3;
        MutableSharedFlow mutableSharedFlow4;
        MutableSharedFlow mutableSharedFlow5;
        MutableSharedFlow mutableSharedFlow6;
        b0 b0Var4;
        MutableSharedFlow mutableSharedFlow7;
        MutableSharedFlow mutableSharedFlow8;
        b0 b0Var5;
        MutableSharedFlow mutableSharedFlow9;
        b0 b0Var6;
        MutableSharedFlow mutableSharedFlow10;
        f11 = kotlin.coroutines.intrinsics.b.f();
        switch (this.f34033a) {
            case 0:
                kotlin.f.b(obj);
                b0Var = this.f34034b.f33944l1;
                if (b0Var.getValue() == 0) {
                    return wz.p.f75480a;
                }
                PostAdScreens postAdScreens = this.f34035c;
                PostAdScreens postAdScreens2 = PostAdScreens.MAIN_INFO_SCREEN;
                if (postAdScreens == postAdScreens2) {
                    b0Var6 = this.f34034b.f33944l1;
                    T value = b0Var6.getValue();
                    o.f(value);
                    if (((PostAdViewModel.b) value).c()) {
                        mutableSharedFlow10 = this.f34034b.H0;
                        wz.p pVar = wz.p.f75480a;
                        this.f34033a = 1;
                        if (mutableSharedFlow10.emit(pVar, this) == f11) {
                            return f11;
                        }
                        return wz.p.f75480a;
                    }
                }
                if (this.f34035c == postAdScreens2) {
                    b0Var5 = this.f34034b.f33944l1;
                    T value2 = b0Var5.getValue();
                    o.f(value2);
                    if (((PostAdViewModel.b) value2).a()) {
                        mutableSharedFlow9 = this.f34034b.J0;
                        wz.p pVar2 = wz.p.f75480a;
                        this.f34033a = 2;
                        if (mutableSharedFlow9.emit(pVar2, this) == f11) {
                            return f11;
                        }
                        return wz.p.f75480a;
                    }
                }
                PostAdScreens postAdScreens3 = this.f34035c;
                if (postAdScreens3 == postAdScreens2) {
                    mutableSharedFlow8 = this.f34034b.L0;
                    wz.p pVar3 = wz.p.f75480a;
                    this.f34033a = 3;
                    if (mutableSharedFlow8.emit(pVar3, this) == f11) {
                        return f11;
                    }
                    return wz.p.f75480a;
                }
                PostAdScreens postAdScreens4 = PostAdScreens.MEDIA_SCREEN;
                if (postAdScreens3 == postAdScreens4) {
                    b0Var4 = this.f34034b.f33944l1;
                    T value3 = b0Var4.getValue();
                    o.f(value3);
                    if (((PostAdViewModel.b) value3).a()) {
                        mutableSharedFlow7 = this.f34034b.J0;
                        wz.p pVar4 = wz.p.f75480a;
                        this.f34033a = 4;
                        if (mutableSharedFlow7.emit(pVar4, this) == f11) {
                            return f11;
                        }
                        return wz.p.f75480a;
                    }
                }
                PostAdScreens postAdScreens5 = this.f34035c;
                if (postAdScreens5 == postAdScreens4) {
                    mutableSharedFlow6 = this.f34034b.L0;
                    wz.p pVar5 = wz.p.f75480a;
                    this.f34033a = 5;
                    if (mutableSharedFlow6.emit(pVar5, this) == f11) {
                        return f11;
                    }
                    return wz.p.f75480a;
                } else if (postAdScreens5 == PostAdScreens.ATTRIBUTES_SCREEN) {
                    mutableSharedFlow5 = this.f34034b.L0;
                    wz.p pVar6 = wz.p.f75480a;
                    this.f34033a = 6;
                    if (mutableSharedFlow5.emit(pVar6, this) == f11) {
                        return f11;
                    }
                    return wz.p.f75480a;
                } else {
                    PostAdScreens postAdScreens6 = PostAdScreens.EXTRA_INFO_SCREEN;
                    if (postAdScreens5 == postAdScreens6) {
                        b0Var3 = this.f34034b.f33944l1;
                        T value4 = b0Var3.getValue();
                        o.f(value4);
                        if (((PostAdViewModel.b) value4).b()) {
                            mutableSharedFlow4 = this.f34034b.V0;
                            wz.p pVar7 = wz.p.f75480a;
                            this.f34033a = 7;
                            if (mutableSharedFlow4.emit(pVar7, this) == f11) {
                                return f11;
                            }
                            return wz.p.f75480a;
                        }
                    }
                    if (this.f34035c == postAdScreens6) {
                        b0Var2 = this.f34034b.f33944l1;
                        T value5 = b0Var2.getValue();
                        o.f(value5);
                        if (((PostAdViewModel.b) value5).d()) {
                            mutableSharedFlow3 = this.f34034b.P0;
                            wz.p pVar8 = wz.p.f75480a;
                            this.f34033a = 8;
                            if (mutableSharedFlow3.emit(pVar8, this) == f11) {
                                return f11;
                            }
                            return wz.p.f75480a;
                        }
                    }
                    PostAdScreens postAdScreens7 = this.f34035c;
                    if (postAdScreens7 == postAdScreens6) {
                        mutableSharedFlow2 = this.f34034b.N0;
                        wz.p pVar9 = wz.p.f75480a;
                        this.f34033a = 9;
                        if (mutableSharedFlow2.emit(pVar9, this) == f11) {
                            return f11;
                        }
                        return wz.p.f75480a;
                    } else if (postAdScreens7 == PostAdScreens.PLANS_SCREEN) {
                        mutableSharedFlow = this.f34034b.N0;
                        wz.p pVar10 = wz.p.f75480a;
                        this.f34033a = 10;
                        if (mutableSharedFlow.emit(pVar10, this) == f11) {
                            return f11;
                        }
                        return wz.p.f75480a;
                    } else {
                        return wz.p.f75480a;
                    }
                }
            case 1:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 2:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 3:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 4:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 5:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 6:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 7:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 8:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 9:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            case 10:
                kotlin.f.b(obj);
                return wz.p.f75480a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$findNavigationTarget$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
