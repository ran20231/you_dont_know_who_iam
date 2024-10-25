package com.forsale.app.features.maincontainer;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$updateLanguage$1", f = "MainContainerViewModel.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$updateLanguage$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31533a;

    /* renamed from: b  reason: collision with root package name */
    Object f31534b;

    /* renamed from: c  reason: collision with root package name */
    int f31535c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31536d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$updateLanguage$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$updateLanguage$1> aVar) {
        super(2, aVar);
        this.f31536d = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$updateLanguage$1(this.f31536d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Languages language;
        MainContainerViewModel mainContainerViewModel;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31535c;
        if (i11 != 0) {
            if (i11 == 1) {
                mainContainerViewModel = (MainContainerViewModel) this.f31534b;
                Languages languages = (Languages) this.f31533a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            UserEntity value = this.f31536d.p1().getValue();
            if (value != null && (language = value.getLanguage()) != null) {
                MainContainerViewModel mainContainerViewModel2 = this.f31536d;
                LocaleManager localeManager = LocaleManager.f39597a;
                this.f31533a = language;
                this.f31534b = mainContainerViewModel2;
                this.f31535c = 1;
                obj = localeManager.w(language, this);
                if (obj == f11) {
                    return f11;
                }
                mainContainerViewModel = mainContainerViewModel2;
            }
            return wz.p.f75480a;
        }
        if (((Boolean) obj).booleanValue()) {
            mainContainerViewModel.h1().i(wz.p.f75480a);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$updateLanguage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
