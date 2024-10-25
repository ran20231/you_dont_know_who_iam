package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
/* compiled from: ProhibitedKeywordsRepository.kt */
/* loaded from: classes2.dex */
public final class ProhibitedKeywordsRepository implements CoroutineScope {
    public static final int $stable = 8;
    private final CoroutineExceptionHandler handler;
    public List<String> prohibitedKeywords;
    private final ProhibitedKeywordDao prohibitedKeywordsDAO;

    /* compiled from: ProhibitedKeywordsRepository.kt */
    @d(c = "com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository$1", f = "ProhibitedKeywordsRepository.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            ProhibitedKeywordsRepository prohibitedKeywordsRepository;
            int y11;
            CharSequence Z0;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    prohibitedKeywordsRepository = (ProhibitedKeywordsRepository) this.L$0;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                ProhibitedKeywordsRepository prohibitedKeywordsRepository2 = ProhibitedKeywordsRepository.this;
                ProhibitedKeywordDao prohibitedKeywordDao = prohibitedKeywordsRepository2.prohibitedKeywordsDAO;
                this.L$0 = prohibitedKeywordsRepository2;
                this.label = 1;
                Object allProhibitedKeywords = prohibitedKeywordDao.getAllProhibitedKeywords(this);
                if (allProhibitedKeywords == f11) {
                    return f11;
                }
                prohibitedKeywordsRepository = prohibitedKeywordsRepository2;
                obj = allProhibitedKeywords;
            }
            Iterable<ProhibitedKeywordEntity> iterable = (Iterable) obj;
            y11 = s.y(iterable, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (ProhibitedKeywordEntity prohibitedKeywordEntity : iterable) {
                Z0 = StringsKt__StringsKt.Z0(prohibitedKeywordEntity.getKeyword());
                String lowerCase = Z0.toString().toLowerCase(Locale.ROOT);
                o.h(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            prohibitedKeywordsRepository.setProhibitedKeywords(arrayList);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    public ProhibitedKeywordsRepository(ProhibitedKeywordDao prohibitedKeywordsDAO) {
        o.i(prohibitedKeywordsDAO, "prohibitedKeywordsDAO");
        this.prohibitedKeywordsDAO = prohibitedKeywordsDAO;
        ProhibitedKeywordsRepository$special$$inlined$CoroutineExceptionHandler$1 prohibitedKeywordsRepository$special$$inlined$CoroutineExceptionHandler$1 = new ProhibitedKeywordsRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        this.handler = prohibitedKeywordsRepository$special$$inlined$CoroutineExceptionHandler$1;
        BuildersKt__Builders_commonKt.launch$default(this, prohibitedKeywordsRepository$special$$inlined$CoroutineExceptionHandler$1, null, new AnonymousClass1(null), 2, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        return Job$default.plus(Dispatchers.getIO());
    }

    public final List<String> getProhibitedKeywords() {
        List<String> list = this.prohibitedKeywords;
        if (list != null) {
            return list;
        }
        o.w("prohibitedKeywords");
        return null;
    }

    public final List<String> getProhibtedKeyWordsLiveData() {
        int y11;
        CharSequence Z0;
        List<ProhibitedKeywordEntity> value = this.prohibitedKeywordsDAO.getAllProhibitedKeywordsAsLiveData().getValue();
        if (value != null) {
            List<ProhibitedKeywordEntity> list = value;
            y11 = s.y(list, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (ProhibitedKeywordEntity prohibitedKeywordEntity : list) {
                Z0 = StringsKt__StringsKt.Z0(prohibitedKeywordEntity.getKeyword());
                String lowerCase = Z0.toString().toLowerCase(Locale.ROOT);
                o.h(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            return arrayList;
        }
        return null;
    }

    public final Set<String> prohibitedKeywordsIn(String text) {
        List n11;
        Set<String> c12;
        int y11;
        Set<String> p02;
        o.i(text, "text");
        if (this.prohibitedKeywords == null) {
            n11 = r.n();
            c12 = CollectionsKt___CollectionsKt.c1(n11);
            return c12;
        }
        List<String> N0 = TypeExtensionsKt.N0(text);
        y11 = s.y(N0, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (String str : N0) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        p02 = CollectionsKt___CollectionsKt.p0(arrayList, getProhibitedKeywords());
        return p02;
    }

    public final void setProhibitedKeywords(List<String> list) {
        o.i(list, "<set-?>");
        this.prohibitedKeywords = list;
    }
}
