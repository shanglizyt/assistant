package com.assistant.action.jfc;

import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.opensymphony.xwork2.ActionSupport;

public class JFreeChartAction extends ActionSupport {

	/**
     * 
     */
	private static final long serialVersionUID = 5752180822913527064L;

	// 供ChartResult调用->ActionInvocation.getStack().findValue("chart")
	private JFreeChart chart;

	public String jfc() throws Exception {
		// 设置数据
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Java", new Double(43.2));
		data.setValue("Visual Basic", new Double(1.0));
		data.setValue("C/C++", new Double(17.5));
		data.setValue("tangjun", new Double(60.0));
		// 生成JFreeChart对象
		chart = ChartFactory.createPieChart("Pie Chart", data, true, true,
				false);

		return SUCCESS;
	}

	@SuppressWarnings("unused")
	public String draw() {

		System.out.println("into draw...");
		int width;// 图象宽度
		int height; // 图象高度
		String chartTitle;// 图表标题
		String subtitle;// 副标题
		String xTitle;// X轴标题
		String yTitle;// Y轴标题
		String[] cutline;// 图例名称
		String category[]; // 统计种类
		Double[][] data;// 绘图数据

		width = 450;
		height = 325;
		chartTitle = "用户个人营养摄入分析";
		subtitle = "------统计时间：2013年";
		xTitle = "销售季度";
		yTitle = "摄入量    单位:g";
		cutline = new String[] { "糖类", "维生素", "脂肪", "蛋白质" };
		category = new String[] { "2月", "3月", "4月", "5月", "6月", "7月" };

		// 创建主题样式，解决中文乱码
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// 设置标题字体
		standardChartTheme.setExtraLargeFont(new Font("黑体", Font.BOLD, 20));
		// 设置图例的字体
		standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
		// 设置轴向的字体
		standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
		// 应用主题样式
		ChartFactory.setChartTheme(standardChartTheme);

		data = new Double[cutline.length][category.length];
		for (int m = 0; m < cutline.length; m++) {
			for (int n = 0; n < category.length; n++) {
				data[m][n] = 1 + Math.random() * 100;
			}
		}
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (int m = 0; m < cutline.length; m++) {
			for (int n = 0; n < category.length; n++) {
				dataset.addValue(data[m][n], cutline[m], category[n]);
			}
		}
		chart = ChartFactory.createBarChart3D(chartTitle, // 图表标题
				xTitle, // X轴标题
				yTitle, // Y轴标题
				dataset, // 绘图数据集
				PlotOrientation.VERTICAL, // 柱形图绘制方向
				true, // 显示图例
				true, // 采用标准生成器
				false // 生成链接
				);

//		// 自定义图表开始：
//		if (subtitle.length() > 0) {// 添加副标题
//			chart.addSubtitle(new TextTitle(subtitle));
//		}
//
//		GradientPaint chartGP = new GradientPaint(0, 0,
//				new Color(219, 227, 251), 0, height, Color.WHITE, false);// 创建渐变色对象
//		chart.setBackgroundPaint(chartGP);// 设置图片背景色
//
//		// 通过绘图区对象，可以设置更多的绘图属性
//		CategoryPlot plot = chart.getCategoryPlot();
//
//		plot.setBackgroundPaint(Color.PINK);// 设置绘图区背景色
//
//		plot.setRangeGridlinePaint(Color.RED);// 设置水平方向背景线颜色
//		plot.setRangeGridlinesVisible(true);// 设置是否显示水平方向背景线,默认值为true
//
//		plot.setDomainGridlinePaint(Color.RED);// 设置垂直方向背景线颜色
//		plot.setDomainGridlinesVisible(true);// 设置是否显示垂直方向背景线,默认值为false
//
//		// 通过柱形对象，可以设置柱形的绘图属性
//		BarRenderer renderer = (BarRenderer) plot.getRenderer();
//
//		renderer.setDrawBarOutline(false);// 设置是否绘制柱形的轮廓线，默认值为true
//
//		// 设置填充柱形的渐进色
//		Color color[] = new Color[cutline.length];
//		color[0] = new Color(99, 99, 0);
//		color[1] = new Color(255, 169, 66);
//		color[2] = new Color(33, 255, 66);
//		for (int i = 0; i < color.length; i++) {
//			GradientPaint gp = new GradientPaint(0, 0, color[i].brighter(), 0,
//					height, color[i].darker());
//			renderer.setSeriesPaint(i, gp);
//		}
//
//		// 设置横轴标题文字的旋转方向
//		CategoryAxis domainAxis = plot.getDomainAxis();
//		domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
//		// 自定义图表结束！
//
//		// 固定用法
//		ChartRenderingInfo info = new ChartRenderingInfo(
//				new StandardEntityCollection());

		return "draw";
	}

	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}

}
