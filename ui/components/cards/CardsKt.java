package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.recyclerview.widget.RecyclerView;
import coil.compose.AsyncImagePainter;
import com.forsale.designSystem.layouts.c;
import com.google.android.gms.ads.AdRequest;
import g00.a;
import g00.l;
import g00.q;
import h5.d;
import hk.a;
import j0.d1;
import j0.k0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import r0.b;
import w.t;
import wz.p;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.c r39, g00.a<wz.p> r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, hk.a r49, hk.a r50, hk.a r51, hk.a r52, hk.a r53, java.lang.Integer r54, androidx.compose.runtime.a r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.cards.CardsKt.a(androidx.compose.ui.c, g00.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void");
    }

    public static final void b(c cVar, a<p> onClick, String str, String str2, String meta, String title, List<String> attributes, String str3, String str4, String time, hk.a aVar, hk.a aVar2, hk.a aVar3, hk.a aVar4, hk.a aVar5, Integer num, androidx.compose.runtime.a aVar6, int i11, int i12, int i13) {
        c cVar2;
        boolean z11;
        r0.a aVar7;
        o.i(onClick, "onClick");
        o.i(meta, "meta");
        o.i(title, "title");
        o.i(attributes, "attributes");
        o.i(time, "time");
        androidx.compose.runtime.a h11 = aVar6.h(-1715867101);
        c cVar3 = (i13 & 1) != 0 ? c.f7566a : cVar;
        String str5 = (i13 & 8) != 0 ? null : str2;
        String str6 = (i13 & 128) != 0 ? null : str3;
        String str7 = (i13 & 256) != 0 ? null : str4;
        hk.a aVar8 = (i13 & 1024) != 0 ? null : aVar;
        hk.a aVar9 = (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : aVar2;
        hk.a aVar10 = (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : aVar3;
        hk.a aVar11 = (i13 & 8192) != 0 ? null : aVar4;
        hk.a aVar12 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : aVar5;
        Integer num2 = (32768 & i13) != 0 ? null : num;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1715867101, i11, i12, "com.forsale.ui.components.cards.CardHorizontal (Cards.kt:253)");
        }
        if (aVar10 != null ? aVar10 instanceof a.C0648a : true) {
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                cVar2 = cVar3;
                D = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D);
            } else {
                cVar2 = cVar3;
            }
            h11.S();
            k0 k0Var = (k0) D;
            h11.C(1157296644);
            boolean T = h11.T(k0Var);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new CardsKt$CardHorizontal$18$1(k0Var);
                h11.u(D2);
            }
            h11.S();
            l lVar = (l) D2;
            h11.C(1157296644);
            boolean T2 = h11.T(k0Var);
            Object D3 = h11.D();
            if (T2 || D3 == c0064a.a()) {
                D3 = new CardsKt$CardHorizontal$19$1(k0Var);
                h11.u(D3);
            }
            h11.S();
            AsyncImagePainter b11 = d.b(str, null, null, null, lVar, (l) D3, null, null, 0, h11, (i11 >> 6) & 14, 462);
            q<t, androidx.compose.runtime.a, Integer, p> q11 = q(aVar8, aVar9, null, null, aVar12, h11, (i12 & 14) | (i12 & 112) | (i12 & 57344), 12);
            hk.a aVar13 = aVar8;
            q<t, androidx.compose.runtime.a, Integer, p> q12 = q(null, null, aVar10, aVar11, null, h11, (i12 & 896) | (i12 & 7168), 19);
            g00.p<androidx.compose.runtime.a, Integer, p> r11 = r(str6);
            g00.p<androidx.compose.runtime.a, Integer, p> r12 = r(str7);
            boolean c11 = c(k0Var);
            if (num2 != null) {
                num2.intValue();
                z11 = true;
                aVar7 = b.b(h11, 1112758340, true, new CardsKt$CardHorizontal$20$1(num2, i12));
            } else {
                z11 = true;
                aVar7 = null;
            }
            com.forsale.designSystem.layouts.CardsKt.b(onClick, b11, b.b(h11, 1961660806, z11, new CardsKt$CardHorizontal$22(meta, i11)), b.b(h11, -1067235705, z11, new CardsKt$CardHorizontal$23(title, i11)), b.b(h11, 198835080, z11, new CardsKt$CardHorizontal$24(attributes)), null, b.b(h11, -1563990646, z11, new CardsKt$CardHorizontal$25(time, i11)), cVar2, q11, q12, r11, r12, c11, aVar7, str5 != null ? b.b(h11, -1216959693, z11, new CardsKt$CardHorizontal$21$1(str5, i11)) : null, h11, ((i11 >> 3) & 14) | 1600896 | ((i11 << 21) & 29360128), 0, 32);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new CardsKt$CardHorizontal$26(cVar2, onClick, str, str5, meta, title, attributes, str6, str7, time, aVar13, aVar9, aVar10, aVar11, aVar12, num2, i11, i12, i13));
            return;
        }
        throw new IllegalArgumentException("horizontal card If has virtual tour tag must be TagState.Icon".toString());
    }

    private static final boolean c(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean e(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.ui.c r26, g00.a<wz.p> r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, hk.a r32, hk.a r33, hk.a r34, hk.a r35, hk.a r36, java.lang.Integer r37, androidx.compose.runtime.a r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.cards.CardsKt.g(androidx.compose.ui.c, g00.a, java.lang.String, java.lang.String, java.lang.String, java.lang.String, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(g00.a<wz.p> r38, com.forsale.designSystem.layouts.c r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.util.List<java.lang.String> r43, java.lang.String r44, androidx.compose.ui.c r45, hk.a r46, hk.a r47, hk.a r48, hk.a r49, hk.a r50, java.lang.String r51, java.lang.String r52, java.lang.Integer r53, androidx.compose.runtime.a r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.cards.CardsKt.h(g00.a, com.forsale.designSystem.layouts.c, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, androidx.compose.ui.c, hk.a, hk.a, hk.a, hk.a, hk.a, java.lang.String, java.lang.String, java.lang.Integer, androidx.compose.runtime.a, int, int, int):void");
    }

    public static final void i(g00.a<p> onClick, com.forsale.designSystem.layouts.c dataOf, String str, String meta, List<Pair<String, String>> titleItems, String time, c cVar, hk.a aVar, hk.a aVar2, hk.a aVar3, hk.a aVar4, hk.a aVar5, String str2, String str3, Integer num, androidx.compose.runtime.a aVar6, int i11, int i12, int i13) {
        r0.a aVar7;
        o.i(onClick, "onClick");
        o.i(dataOf, "dataOf");
        o.i(meta, "meta");
        o.i(titleItems, "titleItems");
        o.i(time, "time");
        androidx.compose.runtime.a h11 = aVar6.h(-1690697111);
        c.a aVar8 = (i13 & 64) != 0 ? c.f7566a : cVar;
        hk.a aVar9 = (i13 & 128) != 0 ? null : aVar;
        hk.a aVar10 = (i13 & 256) != 0 ? null : aVar2;
        hk.a aVar11 = (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : aVar3;
        hk.a aVar12 = (i13 & 1024) != 0 ? null : aVar4;
        hk.a aVar13 = (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : aVar5;
        String str4 = (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str2;
        String str5 = (i13 & 8192) != 0 ? null : str3;
        Integer num2 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1690697111, i11, i12, "com.forsale.ui.components.cards.CardStacked (Cards.kt:100)");
        }
        if (o.d(dataOf, new c.b(false, 1, null)) ? aVar11 instanceof a.C0648a : true) {
            AsyncImagePainter a11 = d.a(str, null, null, null, 0, h11, (i11 >> 6) & 14, 30);
            int i14 = i11 >> 21;
            int i15 = i12 << 9;
            q<t, androidx.compose.runtime.a, Integer, p> q11 = q(aVar9, aVar10, null, null, aVar13, h11, (i14 & 14) | (i14 & 112) | (i15 & 57344), 12);
            q<t, androidx.compose.runtime.a, Integer, p> q12 = q(null, null, aVar11, aVar12, null, h11, (i15 & 7168) | (i14 & 896), 19);
            g00.p<androidx.compose.runtime.a, Integer, p> r11 = r(str4);
            g00.p<androidx.compose.runtime.a, Integer, p> r12 = r(str5);
            if (num2 != null) {
                num2.intValue();
                aVar7 = b.b(h11, 363466986, true, new CardsKt$CardStacked$12$1(num2, i12));
            } else {
                aVar7 = null;
            }
            Integer num3 = num2;
            hk.a aVar14 = aVar11;
            com.forsale.designSystem.layouts.CardsKt.e(onClick, dataOf, a11, b.b(h11, -1446079328, true, new CardsKt$CardStacked$13(meta, i11)), b.b(h11, -226227767, true, new CardsKt$CardStacked$14(titleItems)), b.b(h11, -1200271454, true, new CardsKt$CardStacked$15(time, i11)), aVar8, q11, q12, r11, r12, false, aVar7, null, h11, (i11 & 14) | 224256 | (com.forsale.designSystem.layouts.c.f41896e << 3) | (i11 & 112) | (i11 & 3670016), 0, 10240);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new CardsKt$CardStacked$16(onClick, dataOf, str, meta, titleItems, time, aVar8, aVar9, aVar10, aVar14, aVar12, aVar13, str4, str5, num3, i11, i12, i13));
            return;
        }
        throw new IllegalArgumentException("when card stacked dateOf == CardStackedData.Small(), tag must be TagState.Icon".toString());
    }

    private static final boolean j(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00db, code lost:
        if ((r34 & 32) != 0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(hk.a r23, java.lang.Integer r24, int r25, long r26, long r28, long r30, androidx.compose.runtime.a r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.cards.CardsKt.l(hk.a, java.lang.Integer, int, long, long, long, androidx.compose.runtime.a, int, int):void");
    }

    private static final q<t, androidx.compose.runtime.a, Integer, p> q(hk.a aVar, hk.a aVar2, hk.a aVar3, hk.a aVar4, hk.a aVar5, androidx.compose.runtime.a aVar6, int i11, int i12) {
        hk.a aVar7;
        hk.a aVar8;
        hk.a aVar9;
        hk.a aVar10;
        hk.a aVar11;
        aVar6.C(192869871);
        if ((i12 & 1) != 0) {
            aVar7 = null;
        } else {
            aVar7 = aVar;
        }
        if ((i12 & 2) != 0) {
            aVar8 = null;
        } else {
            aVar8 = aVar2;
        }
        if ((i12 & 4) != 0) {
            aVar9 = null;
        } else {
            aVar9 = aVar3;
        }
        if ((i12 & 8) != 0) {
            aVar10 = null;
        } else {
            aVar10 = aVar4;
        }
        if ((i12 & 16) != 0) {
            aVar11 = null;
        } else {
            aVar11 = aVar5;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(192869871, i11, -1, "com.forsale.ui.components.cards.findTags (Cards.kt:407)");
        }
        if (aVar8 == null && aVar7 == null && aVar9 == null && aVar11 == null) {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            aVar6.S();
            return null;
        }
        r0.a b11 = b.b(aVar6, 1354608858, true, new CardsKt$findTags$1(aVar7, i11, aVar8, aVar9, aVar10, aVar11));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar6.S();
        return b11;
    }

    private static final g00.p<androidx.compose.runtime.a, Integer, p> r(String str) {
        if (str == null) {
            return null;
        }
        return b.c(-1038167160, true, new CardsKt$findTrailing$1(str));
    }
}
